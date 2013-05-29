package syntax;

public class Nil extends Value{
	public String toString(){
		return "nil";
	}
	
	public Object eval() {
		//System.out.println("NIL!");
		return this;
	}
}