package syntax;

import interpreter.Interpreter;

public class Second extends Expression{
	Expression e;
	
	public String toString(){
		return "snd " + e.toString();
	}
	
	public Second(Object yysv){
		e = (Expression) yysv;
	}
	
	public Value eval() {
		try {
			Pair pair = (Pair)e;
			PairValue pv = pair.eval();
			return pv.second;
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