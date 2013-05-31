package syntax;

public class Value extends Expression{
	public Value eval() {
		System.out.println("calling Value's eval, this behavior should not happen");
		System.exit(-1);
		return null;
	}
	public BoolValue equal(Value o){
		System.out.println("calling Value's equal, this behavior should not happen");
		System.exit(-1);
		return new BoolValue(false);
	}
}