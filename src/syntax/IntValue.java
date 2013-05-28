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
	
    Object eval() {
    	if (isUndef) return null;
    	else return value;
    }
}