package syntax;

import symbol.SymbolTable;


public class AnonymousFunction extends Value{
	public Variable arg;
	public Expression body;
	
	public String toString(){
		return "fun " + arg.toString() + " -> " + body.toString();
	}
	
	public AnonymousFunction(Object yysv, Object yysv2) {
		this.arg = (Variable) yysv;
		this.body = (Expression) yysv2;
	}
	
	
	/*
	 * this method has some problem, it make all AnonymousFunctin the same type.
	 * actually this is not true, because you can't do such thing:
	 * let f1 = fun x -> fun y -> x+y
	 * let f2 = fux x -> x && false
	 * you can't apply f2 to where should be f1
	 */
	public Object eval() {
		return this;
	}
	
	public Object apply(Expression e){
		int enter = SymbolTable.getSize();
		SymbolTable.push(arg, e.eval());
		Object result = body.eval();
		SymbolTable.popTo(enter);
//		System.out.println("application apply: "+ result.toString());
		return result;
	}
}