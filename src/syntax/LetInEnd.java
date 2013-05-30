package syntax;

import symbol.SymbolTable;
import interpreter.Interpreter;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	
	public String toString(){
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}
	
	public LetInEnd(Object v ,Object def , Object body) {
		x = (Variable) v;
		definition = (Expression) def;
		this.body = (Expression) body; 
	}
	
	public Value eval() {
		int enter = Interpreter.symbolTable.getSize();
				
		Value d = definition.eval();
		if (d==null) System.out.println("Runtime Error!");
		Interpreter.symbolTable.push(x,d);
		
		if ( definition instanceof AnonymousFunction){
			((AnonymousFunction)definition).localTable = (SymbolTable) Interpreter.symbolTable.clone();
		}
		Value b = body.eval();
		
		Interpreter.symbolTable.popTo(enter);
		return b;
	}
}