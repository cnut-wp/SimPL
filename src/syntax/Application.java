package syntax;

import interpreter.Interpreter;


public class Application extends Expression{
	Expression func;
	Expression param;

	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}
	
	public Application(Object yysv, Object yysv2){
		try {
			func = (Expression) yysv;
			param = (Expression) yysv2;
		} catch ( Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	
	public Value eval() {
		AnonymousFunction finalFunc=null;
		try{
			finalFunc = (AnonymousFunction) func.eval();
		}catch (Exception e) {
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug){
				e.printStackTrace();
			}
			System.exit(-1);
		}
		Value result = finalFunc.apply(param);
		return result;
	}
}