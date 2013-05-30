package syntax;

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
				System.out.println("RunTime Error!");
			}
			boolean  b = false;
			try {
				b = ((BoolValue)c).value;
			}catch(Exception e) {
				System.out.println("Type Error!");
			}
			if (b) body.eval();
			else break;
		}
		return null;
	}
	
	public WhileDoEnd(Object c , Object b) {
		condition = (Expression) c;
		body = (Expression) b;
	}
}
