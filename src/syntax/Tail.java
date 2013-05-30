package syntax;

public class Tail extends Expression{
	Expression e;	
	public Tail(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "tail " + e.toString();
	}
	
	public Value eval() {
		System.out.println("e "+e.getClass());
		Value o = e.eval();
		System.out.println("o "+o.getClass());
		if (o instanceof Nil) return o;
		try {
			ListValue v = (ListValue) o;			
			return v.tail.eval();
		}catch (Exception e) {
			System.out.println("Runtime error!");
		}
		return null;
	}
}