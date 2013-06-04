package syntax;

import interpreter.Interpreter;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public IfThenElse(Object o1, Object o2, Object o3){
		try {
			condition = (Expression) o1;
			thenClause = (Expression) o2;
			elseClause = (Expression) o3;
		} catch ( Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	
	public IfThenElse(Object o1, Object o2){
		condition = (Expression) o1;
		thenClause = (Expression) o2;
		elseClause = null;
	}
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}
	
	public Value eval() {
		Value c = condition.eval(); boolean b = false;
		if (c==null){
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				System.out.println("In IfThenElse: Condition eval return null");
			}
			System.exit(-1);
		}
		try {
			b = ((BoolValue)c).value;			
		}catch (Exception e) {
			System.out.println("Type Error!");
			if (Interpreter.debug){
				System.out.println("In IfThenElse: Condition eval return not BoolValue");
			}
			System.exit(-1);
		}
		Value result = null;
		if (b){
			result = thenClause.eval();
		} else {
			if (elseClause != null) result = elseClause.eval();
		}
		return result;
	}
	
}