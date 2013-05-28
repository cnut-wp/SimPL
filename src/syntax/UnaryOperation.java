package syntax;

public class UnaryOperation extends Expression{
	public enum UnaryOperator{
		not, negative
	}
	
	Expression e;
	UnaryOperator op;
	
	public UnaryOperation(UnaryOperator uop, Object exp) {
		e = (Expression) exp;
		op = uop;
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
	
	public Object eval() {
		Object o = e.eval();
		if (o==null) {
			System.out.println("Runtime Error!");
		}
		switch(op){
		case not:
			try{
				boolean b = (Boolean)o;
				return !b;
			}
			catch (Exception e) {
				System.out.println("Type Error!");
			}
			break;
		case negative:
			try{
				int b = (Integer)o;
				return -b;
			}
			catch (Exception e) {
				System.out.println("Type Error!");
			}
			break;
		}
		return null;
	}
}