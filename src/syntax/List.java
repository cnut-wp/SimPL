package syntax;

public class List extends Expression{
	Expression head;
	Expression tail;	
	
	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
	
	public Value eval() {
		Value h = head.eval();
		Value t = tail.eval();
		if (h == null || t == null){	
			System.out.println("runtime error");
		}
		try{
			if (t instanceof Nil ){
				return new ListValue(h , t);
			} else {
				ListValue tmp = (ListValue) t;
				if (h.getClass().equals(tmp.head.getClass()))
					return new ListValue(h , t);
			}
		} catch (Exception e){
			System.out.println("type error");
		}
		return null;
		
	}
	
	public List(Object o1 , Object o2) {
		head = (Expression) o1;
		tail = (Expression) o2;
	}
}