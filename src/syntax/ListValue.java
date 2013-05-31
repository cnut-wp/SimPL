package syntax;

public class ListValue extends Value{
	Value head;
	Value tail;
	
	public ListValue(Value h, Value t) {
		head = h;
		tail = t;
	}

	public String toString(){
		return "[" + head.toString() + ", " + tail.toString() + "]";
	}
	
	public Value eval() {
		return this;
	}
	
	public BoolValue equal(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (anValue instanceof ListValue){
			ListValue anL = (ListValue) anValue;
			boolean h = (head.equal(anL.head)).value;
			boolean t = (tail.equal(anL.tail)).value;
			return new BoolValue(h&&t);
		}
		return new BoolValue(false);
	}
}