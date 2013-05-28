package syntax;

public class IfThenElse extends Expression{
	Expression condition;
	Expression thenClause;
	Expression elseClause;
	
	public IfThenElse(Object o1, Object o2, Object o3){
		condition = (Expression) o1;
		thenClause = (Expression) o2;
		elseClause = (Expression) o3;
	}
	
	public IfThenElse(Object o1, Object o2){
		condition = (Expression) o1;
		thenClause = (Expression) o2;
		elseClause = null;
	}
	public String toString(){
		return "if " + condition.toString() + " then " + thenClause.toString() + " else " + elseClause.toString();
	}
	
	public Object eval() {
		Object c = condition.eval(); boolean b = false;
		if (c==null) System.out.println("Runtime Error!");
		try {
			b = (Boolean)c;
			
		}catch (Exception e) {
			System.out.println("Type Error!");
		}
		Object result = null;
		if (b) result = thenClause.eval();
		else {
			if (elseClause != null) result = elseClause.eval();
		}
		return result;
	}
	
}