package syntax;

import interpreter.Interpreter;


public class IntValue extends Value{
	boolean isUndef=true;
	int value;
	public IntValue(Object i) {
		try {
			value =  Integer.parseInt((String)i);
			isUndef = false;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	public IntValue(int i) {
		value = i;
		isUndef = false;
	}
	public String toString(){
		if(isUndef)
			return "undef";
		else
			return String.valueOf(value);
	}
	
	public Value eval() {
		if (isUndef){
			Interpreter.out.println("access undef integer, runtime error");
			System.exit(-1);
			return null;
		}
		else{
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
		if (anValue instanceof IntValue){
			return new BoolValue(((IntValue) anValue).value==this.value);
		}
		return new BoolValue(false);
		
	}
}