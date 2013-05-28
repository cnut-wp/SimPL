package syntax;

public class Nop extends Value{
	public String toString(){
		return "()";
	}
	
	public Object eval() {
		return null;
	}
}