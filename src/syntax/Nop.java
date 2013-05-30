package syntax;

public class Nop extends Value{
	public String toString(){
		return "()";
	}
	
	public Value eval() {
		return this;
	}
	
	public BoolValue equals(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (anValue instanceof Nop){
			return new BoolValue(true);
		}
		return new BoolValue(false);
	}
}