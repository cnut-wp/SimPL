package syntax;

public class IntValue extends Value{
	boolean isUndef;
	int value;
	public IntValue(Object i) {
		value = (Integer) i;
	}
	public String toString(){
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
}