package syntax;

import interpreter.Interpreter;

public class WhileDoEnd extends Expression{
	Expression condition;
	Expression body;
	
	public String toString(){
		return "while " + condition.toString() + " do " + body.toString() + " end";
	}
	
	public Value eval() {
		while (true){
			Value c = condition.eval();
			if (c==null) {
				Interpreter.out.println("RunTime Error!");
				if (Interpreter.debug){
					Interpreter.out.println("In WhileDoEnd: " + c);
				}
				System.exit(-1);
			}
			boolean  b = false;
			try {
				b = ((BoolValue)c).value;
			}catch(Exception e) {
				Interpreter.out.println("Type Error!");
				if (Interpreter.debug){
					e.printStackTrace();
				}
				System.exit(-1);
			}
			if (b){
				Value tmp = body.eval();
				if (!(tmp instanceof Nop)){
					Interpreter.out.println("Type Error!");
					if (Interpreter.debug){
						Interpreter.out.println("In WhileDoEnd: " + "do is not Nop");
					}
					System.exit(-1);
				}
			}
			else break;
		}
		return new Nop();
	}
	
	public WhileDoEnd(Object c , Object b) {
		try {
			condition = (Expression) c;
			body = (Expression) b;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
}
