package syntax;

import interpreter.Interpreter;

public class Value extends Expression{
	public Value eval() {
		Interpreter.out.println("calling Value's eval, this behavior should not happen");
		System.exit(-1);
		return null;
	}
	public BoolValue equal(Value o){
		Interpreter.out.println("calling Value's equal, this behavior should not happen");
		System.exit(-1);
		return new BoolValue(false);
	}
}