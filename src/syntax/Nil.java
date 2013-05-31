package syntax;

public class Nil extends Value{

	public Nil(){}
	
	public String toString(){
		return "nil";
	}
	
	public Value eval() {
		return this;
	}
	
	public BoolValue equal(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (anValue instanceof Nil){
			return new BoolValue(true);
		}
		return new BoolValue(false);
	}
}