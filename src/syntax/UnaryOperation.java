package syntax;

import interpreter.Interpreter;

public class UnaryOperation extends Expression{
	public enum UnaryOperator{
		not, negative
	}
	
	Expression e;
	UnaryOperator op;
	
	public UnaryOperation(UnaryOperator uop, Object exp) {
		try {
			e = (Expression) exp;
			op = uop;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	
	public String toString(){
		String operator = "";
		switch(op){
		case not:
			operator = "not "; break;
		case negative:
			operator = "~"; break;
		}
		return operator + e.toString();
	}
	
	public Value eval() {
		Value o = e.eval();
		if (o==null) {
			Interpreter.out.println("Runtime Error!");
			if (Interpreter.debug){
				Interpreter.out.println("In UnaryOperation: " + o);
			}
			System.exit(-1);
		}
		switch(op){
		case not:
			try{
				boolean b = ((BoolValue)o).value;
				return new BoolValue(!b);
			}
			catch (Exception e) {
				Interpreter.out.println("Type Error!");
				if (Interpreter.debug){
					e.printStackTrace();
				}
				System.exit(-1);
			}
			break;
		case negative:
			try{
				int b = ((IntValue)o).value;
				return new IntValue(-b);
			}
			catch (Exception e) {
				Interpreter.out.println("Type Error!");
				if (Interpreter.debug){
					e.printStackTrace();
				}
				System.exit(-1);
			}
			break;
		}
		return null;
	}
}