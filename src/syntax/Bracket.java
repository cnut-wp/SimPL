package syntax;

import interpreter.Interpreter;

public class Bracket extends Expression{
	Expression e;
	public Bracket(Object o) {
		try {
			e = (Expression) o;
		} catch ( Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
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