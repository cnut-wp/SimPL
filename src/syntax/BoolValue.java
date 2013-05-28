package syntax;

public class BoolValue extends Value{
	boolean value;
	boolean undef = true;

	public BoolValue(Object b){
		value = Boolean.parseBoolean((String)b);
		undef = false;
	}
	public String toString(){
		if(value)
			return "true";
		else
			return "false";
	}
	
	public Object eval() {
		if (undef)
		{
			return null;
		}
		return value;
	}
}