package syntax;

import interpreter.Interpreter;

public class BoolValue extends Value{
	boolean value;
	boolean undef = true;

	public BoolValue(Object b){
		try {
			value = Boolean.parseBoolean((String)b);
			undef = false;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
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
			Interpreter.out.println("access undef boolean, Runtime error");
			System.exit(-1);
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