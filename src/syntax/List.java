package syntax;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
	
	public Object eval() {
		//System.out.println(this.toString());
		//if (head instanceof List) System.out.println("Head is a list!!!"); 
		//else if (tail instanceof List )  System.out.println("Tail is a list!!!");
		Object h = head.eval();
		
		//if (h instanceof Integer) System.out.println("h is "+h);
		 
		Object t = tail.eval();
		return new ListValue(h , t);
	}
	
	public List(Object o1 , Object o2) {
		head = (Expression) o1;
		tail = (Expression) o2;
	}
}