package syntax;

import interpreter.Interpreter;

public class Sequence extends Expression{
	Expression e1;
	Expression e2;

	public Sequence(Object o1, Object o2) {
		try {
			e1 = (Expression) o1;
			e2 = (Expression) o2;
		} catch ( Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}
	
	public Value eval() {
		if (e1 == null || e2 == null)
		{
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				System.out.println("In Sequence: " + e1 + "\t" + e2);
			}
			System.exit(-1);
		}
	    if (!(e1.eval() instanceof Nop)){
	    	System.out.println("Type Error!");
			System.exit(-1);
	    }
		return e2.eval();
	}
}