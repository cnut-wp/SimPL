package syntax;

import java.util.ArrayList;

import symbol.SymbolTable;
import interpreter.Interpreter;


public class AnonymousFunction extends Value{
	public Variable arg;
	public Expression body;
	public SymbolTable localTable=null;
	public ArrayList<String> args= new ArrayList<String>();
	public String stdString = null;
	public String totalToString(){
		return "fun " + arg.toString() + " -> " + body.toString() + " under environment "+ localTable.toString()+ "";
	}
	
	/*
	 * since symbolTable may contain AnonymousFunction function, if this happens, it will enter a call circle, then stack overflow
	 */
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}
	private AnonymousFunction(){};
	
	public AnonymousFunction(Object yysv, Object yysv2) {
		this.arg = (Variable) yysv;
		this.body = (Expression) yysv2;
		localTable = (SymbolTable) Interpreter.symbolTable.clone();
	}
	
	
	/*
	 * this method has some problem, it make all AnonymousFunctin the same type.
	 * actually this is not true, because you can't do such thing:
	 * let f1 = fun x -> fun y -> x+y
	 * let f2 = fux x -> x && false
	 * you can't apply f2 to where should be f1
	 */
	public Value eval() {
		if (Interpreter.debug)
			System.out.println("STD : "+getStdString());
		return this;
	}
	
	public String getStdString() {
		if (stdString!=null) return stdString;
		args= new ArrayList<String>();
		args.add(arg.name);
		Expression e = body;		
		while ( e instanceof AnonymousFunction) {
			Variable v = ((AnonymousFunction)e).arg;
			args.add(v.name);
			e = ((AnonymousFunction)e).body;			
		}		
		String std = this.toString();
		for (int i=args.size()-1; i>=0; i--) {
			String v = args.get(i); boolean same = false;
			for (int j = i+1; j<args.size(); j++) 
				if (v.equals(args.indexOf(j))) {
					same = true; break;
				}
			if (same) continue;
			//System.out.println("replace "+ v );
			if (std.endsWith(" "+v)) {
				int index = std.lastIndexOf(" "+v);
				std = std.substring(0,index);
				std += " "+i+"arg"+i;
			}
			std = std.replaceAll(" "+v+" ", " "+i+"arg"+i+" "); // 0arg0 is not a normal variable name
			
			
		}
		return std;		
	}
	
	public BoolValue equal(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (this == anValue){
			return new BoolValue(true);
		}
		if (anValue instanceof AnonymousFunction){
			String me = getStdString();
			String he = ((AnonymousFunction) anValue).getStdString();
			return new BoolValue(me.equals(he));
		}
		return new BoolValue(false);
		
	}

	public Value apply(Expression e){
		Value result = null;
		if ( body instanceof AnonymousFunction){
			AnonymousFunction resultFun = new AnonymousFunction();
			resultFun.arg = ((AnonymousFunction)body).arg;
			resultFun.body = ((AnonymousFunction)body).body;
			resultFun.localTable = (SymbolTable) ((AnonymousFunction)this).localTable.clone();
			((AnonymousFunction)resultFun).localTable.push(arg, e.eval());
			result = resultFun.eval();
			if (Interpreter.debug)
				System.out.println("application apply: "+ resultFun.totalToString());
		} else {
			this.localTable.push(arg, e.eval());
			SymbolTable tmp = Interpreter.symbolTable;
			Interpreter.symbolTable = localTable;
			result = body.eval();
			Interpreter.symbolTable = tmp;
		}
		return result;
	}
}