package syntax;

import symbol.SymbolTable;

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
	
	public Object eval() {
		int enter = SymbolTable.getSize();
				
		Object d = definition.eval();
		if (d==null) System.out.println("Runtime Error!");
		SymbolTable.push(x,d);
		
		Object b = body.eval();
		
		SymbolTable.popTo(enter);
		return b;
	}
}