package syntax;

public class PairValue extends Value{
	Value first;
	Value second;
	
	public PairValue(Value f, Value s) {
		first = f;
		second = s;
	}

	public String toString(){
		return "(" + first.toString() + ", " + second.toString() + ")";
	}
	
	public Object eval() {
		return this;
	}
}