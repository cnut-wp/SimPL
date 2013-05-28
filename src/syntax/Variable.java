package syntax;

import symbol.SymbolTable;

public class Variable extends Expression{
	String name;
	
	public Variable(Object n) {
		name = (String) n;
	}
	public String toString(){
		return name;
	}
	
	public Object eval() {
		return SymbolTable.get(this);
	}
	
	public boolean equal(Variable v) {
		return name.equals(v.name);
	}
}