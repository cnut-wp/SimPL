package syntax;

import interpreter.Interpreter;

public class First extends Expression{
	Expression e;
	
	public String toString(){
		return "fst " + e.toString();
	}
	
	public First(Object yysv){
		e = (Expression) yysv;
	}
	
	public Value eval() {
		try {
			Pair pair = (Pair)e;
			PairValue pv = pair.eval();
			return pv.first;
		}catch (Exception e) {
			System.out.println("Type Error!");
			if (Interpreter.debug){
				e.printStackTrace();
			}
			System.exit(-1);
		}
		return null;
	}
	
}