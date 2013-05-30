package syntax;

public class Value extends Expression{
	public Value eval() {
		return null;
	}
	public BoolValue equal(Value o){
		return new BoolValue(false);
	}
}