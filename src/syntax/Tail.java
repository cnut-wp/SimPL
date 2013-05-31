package syntax;

import interpreter.Interpreter;

public class Tail extends Expression{
	Expression e;	
	public Tail(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "tail " + e.toString();
	}
	
	public Value eval() {
		Value o = e.eval();
		if (o instanceof Nil) return o;
		try {
			ListValue v = (ListValue) o;			
			return v.tail.eval();
		}catch (Exception e) {
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				e.printStackTrace();
			}
			System.exit(-1);
		}
		return null;
	}
}