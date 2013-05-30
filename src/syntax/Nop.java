package syntax;

public class Nop extends Value{
	public String toString(){
		return "()";
	}
	
	public Value eval() {
		return null;
	}
}