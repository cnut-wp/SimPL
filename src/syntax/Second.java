package syntax;

public class Second extends Expression{
	Expression e;
	
	public String toString(){
		return "snd " + e.toString();
	}
	
	public Second(Object yysv){
		e = (Expression) yysv;
	}
	
	public Object eval() {
		try {
			Pair pair = (Pair)e;
			return pair.getE2();
		}catch (Exception e) {
			System.out.println("Type Error!");
		}
		return null;
	}
}