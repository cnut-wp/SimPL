package syntax;

import interpreter.Interpreter;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
	public Pair(Object yysv, Object yysv2){
		try {
			e1 = (Expression) yysv;
			e2 = (Expression) yysv2;
		} catch ( Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	public PairValue eval() {
		Value f = (Value) e1.eval();
		Value s = (Value) e2.eval();
		if (f == null || s == null){
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				System.out.println("In Pair: first:" +f + " second:" + s);
			}
			System.exit(-1);
		}
		return new PairValue(f,s);
	}
}