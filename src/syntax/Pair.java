package syntax;

public class Pair extends Expression{
	Expression e1;
	Expression e2;
	
	public String toString(){
		return "(" + e1.toString() + ", " + e2.toString() + ")";
	}
	public Pair(Object yysv, Object yysv2){
		e1 = (Expression) yysv;
		e2 = (Expression) yysv2;
	}
	public PairValue eval() {
		Value f = (Value) e1.eval();
		Value s = (Value) e2.eval();
		return new PairValue(f,s);
	}
}