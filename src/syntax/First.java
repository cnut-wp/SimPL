package syntax;

public class First extends Expression{
	Expression e;
	
	public String toString(){
		return "fst " + e.toString();
	}
	
	public First(Object yysv){
		e = (Expression) yysv;
	}
	
	public Object eval() {
		try {
			Pair pair = (Pair)e;
			return pair.getE1();
		}catch (Exception e) {
			System.out.println("Type Error!");
		}
		return null;
	}
	
}