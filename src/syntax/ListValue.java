package syntax;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public ListValue(Value h, Value t) {
		// TODO Auto-generated constructor stub
		//System.out.println(h.getClass());
		head = h;
		tail = t;
	/*	if (h instanceof Integer) { 
			int i = (Integer)h;
			head = new IntValue(i);
		}
		else if (h instanceof Boolean) {
			boolean b = (Boolean) h;
			head = new BoolValue(b);
		}
		else if (h instanceof ListValue) {
			head = (Value) h;
		}
		if (t instanceof Integer) { 
			int i = (Integer)t;
			tail = new IntValue(i);
		}
		else if (t instanceof Boolean) {
			boolean b = (Boolean)t;
			tail = new BoolValue(b);
		}*/
	}

	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
	
	public Value eval() {
		return this;
	}
}