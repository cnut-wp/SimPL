package syntax;

public class Application extends Expression{
	Expression func;
	Expression param;

	public String toString(){
		return "(" + func.toString() + " " + param.toString() + ")";
	}
	
	public Object eval() {
		return null;
	}
}