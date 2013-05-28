package syntax;

public class First extends Expression{
	Expression e;
	
	public String toString(){
		return "fst " + e.toString();
	}
	
	public Object eval() {
		return null;
	}
}