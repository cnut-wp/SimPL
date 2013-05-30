package syntax;

public class Bracket extends Expression{
	Expression e;
	public Bracket(Object o) {
		e = (Expression) o;
	}
	public String toString(){
		return "(" + e.toString() + ")";
	}
	
	public Value eval() {
		if (e == null){
			System.out.println("runtime error");
		}
		return e.eval();
	}
}