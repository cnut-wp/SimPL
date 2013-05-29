package syntax;

import interpreter.Interpreter;

public class Variable extends Expression{
	String name;
	
	public Variable(Object n) {
		name = (String) n;
	}
	public String toString(){
		return name;
	}
	
	public Object eval() {
		return Interpreter.symbolTable.get(this);
	}
	
	public boolean equal(Variable v) {
		return name.equals(v.name);
	}
}