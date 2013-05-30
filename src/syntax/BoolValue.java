package syntax;

public class BoolValue extends Value{
	boolean value;
	boolean undef = true;

	public BoolValue(Object b){
		value = Boolean.parseBoolean((String)b);
		undef = false;
	}
	public BoolValue(boolean a){
		value = a;
		undef = false;
	}
	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}
	
	public Value eval() {
		if (undef)
		{
			System.out.println("access undef boolean, Runtime error");
			return null;
		}else{
			return this;
		}
	}
	
	public BoolValue equal(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (this == anValue){
			return new BoolValue(true);
		}
		if (anValue instanceof BoolValue){
			return new BoolValue(((BoolValue) anValue).value==this.value);
		}
		return new BoolValue(false);
		
	}
}