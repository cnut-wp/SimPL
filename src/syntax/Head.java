package syntax;

public class Head extends Expression{
	Expression e;
	public Head(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "head " + e.toString();
	}
	
	public Value eval() {
		//System.out.println("e "+e.getClass());
		Value o = e.eval();
		//System.out.println("o "+o.getClass());
		if (o instanceof Nil) return o;
		try {
			ListValue v = (ListValue) o;
			Value head = v.head;
		/*	while (true) {
				
				//System.out.println("head "+head.getClass());
				//System.out.println(head);
				if (head instanceof ListValue) {
					head = ((ListValue) head).head;
					//System.out.println("head.head "+head.getClass());
				}
				else break;
			}*/
			return head.eval();
		}catch (Exception e) {
			System.out.println("Runtime error!");
		}
		return null;
	}
}