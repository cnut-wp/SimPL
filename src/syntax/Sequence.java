package syntax;

public class Sequence extends Expression{
	Expression e1;
	Expression e2;

	public Sequence(Object o1, Object o2) {
		e1 = (Expression) o1;
		e2 = (Expression) o2;
	}
	public String toString(){
		return e1.toString() + "; " + e2.toString();
	}
	
	public Value eval() {
		if (e1 == null || e2 == null)
		{
			System.out.println("Runtime Error");
		}
	    if (!(e1.eval() instanceof Nop)){
	    	System.out.println("Type Error");
	    }
		return e2.eval();
	}
}