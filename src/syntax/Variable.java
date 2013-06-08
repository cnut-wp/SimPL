package syntax;

import interpreter.Interpreter;

public class Variable extends Expression{
	String name;
	
	public Variable(Object n) {
		name = (String) n;
	}
	public String toString(){
		return " "+name+" ";
	}
	
	public Value eval() {
		Value ret = Interpreter.symbolTable.get(this);
		if (ret == null){
			Interpreter.out.println("Runtime Error!");
			if (Interpreter.debug){
				Interpreter.out.println("In Variable: return value is null");
			}
			System.exit(-1);
		}
		return ret;
	}
	
	public boolean equal(Variable v) {
		return name.equals(v.name);
	}
}