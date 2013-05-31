package syntax;

import interpreter.Interpreter;

public class Head extends Expression{
	Expression e;
	public Head(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "head " + e.toString();
	}
	
	public Value eval() {
		Value o = e.eval();
		if (o instanceof Nil) return o;
		try {
			ListValue v = (ListValue) o;
			Value head = v.head;
			return head.eval();
		}catch (Exception e) {
			System.out.println("Type error!");
			if (Interpreter.debug){
				e.printStackTrace();
			}
			System.exit(-1);
		}
		return null;
	}
}