package syntax;

public class Variable extends Expression{
	String name;
	
	public Variable(Object n) {
		name = (String) n;
	}
	public String toString(){
		return name;
	}
	
	public Object eval() {
		return null;
	}
}