package syntax;

public class First extends Expression{
	Expression e;
	
	public String toString(){
		return "fst " + e.toString();
	}
	
	public First(Object yysv){
		e = (Expression) yysv;
	}
	
	public Value eval() {
		try {
			Pair pair = (Pair)e;
			PairValue pv = pair.eval();
			return pv.first;
		}catch (Exception e) {
			System.out.println("Type Error!");
		}
		return null;
	}
	
}