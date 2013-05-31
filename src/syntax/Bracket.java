package syntax;

import interpreter.Interpreter;

public class Bracket extends Expression{
	Expression e;
	public Bracket(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "(" + e.toString() + ")";
	}
	
	public Value eval() {
		if (e == null){
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				System.out.println("in Bracket:" + e);
			}
			System.exit(-1);
		}
		return e.eval();
	}
}