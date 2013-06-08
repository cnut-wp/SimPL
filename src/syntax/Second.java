package syntax;

import interpreter.Interpreter;

public class Second extends Expression{
	Expression e;
	
	public String toString(){
		return "snd " + e.toString();
	}
	
	public Second(Object yysv){
		try {
			e = (Expression) yysv;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	
	public Value eval() {
		try {
			//Pair pair = (Pair)e;
			
			PairValue pv = (PairValue) e.eval();
			return pv.second;
		}catch (Exception e) {
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug){
				e.printStackTrace();
			}
			System.exit(-1);
		}
		return null;
	}
}