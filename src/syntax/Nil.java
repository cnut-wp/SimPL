package syntax;

public class Nil extends Value{
	public String toString(){
		return "nil";
	}
	
	public Object eval() {
		return null;
	}
}