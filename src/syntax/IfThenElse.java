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
		if (condition == null || thenClause == null || elseClause == null) {
			System.out.println("Runtime Error!");
			if (Interpreter.debug){
				System.out.println("In IfThenElse: null expr");
			}
			System.exit(-1);
		}
		if (!isThenElseTypeEqual()){
			System.out.println("Type Error!");
			if (Interpreter.debug){
				System.out.println("In IfThenElse: then else not type equal");
			}
			System.exit(-1);
		}
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
	
	
	private boolean isThenElseTypeEqual(){
		if (thenClause instanceof Variable || elseClause instanceof Variable){
			return true;
		}
		if (thenClause instanceof Application || elseClause instanceof Application){
			return true;
		}
		if (thenClause.getClass().equals(elseClause.getClass())){
			if (thenClause.getClass().equals(AnonymousFunction.class)){
				AnonymousFunction a1 = (AnonymousFunction) thenClause;
				AnonymousFunction a2 = (AnonymousFunction) elseClause;
				return twoAnonFunTypeEqual(a1, a2);
			} else {
				return true;
			}
		} else if ((thenClause instanceof List) && (elseClause instanceof Nil)){
			return true;			
		} else if ((thenClause instanceof Nil) && (elseClause instanceof List)){
			return true;			
		} else if ((thenClause instanceof ListValue) && (elseClause instanceof Nil)){
			return true;			
		} else if ((thenClause instanceof Nil) && (elseClause instanceof ListValue)){
			return true;			
		}
		return false;
	}
	
	private boolean twoAnonFunTypeEqual(AnonymousFunction a1, AnonymousFunction a2){
		int argc1=1, argc2=1;
		Expression e1 = a1.body;		
		while ( e1 instanceof AnonymousFunction) {
			argc1++;
			e1 = ((AnonymousFunction)e1).body;			
		}
		Expression e2 = a2.body;		
		while ( e2 instanceof AnonymousFunction) {
			argc2++;
			e2 = ((AnonymousFunction)e2).body;			
		}
		
		if (argc1 != argc2)
			return false;		
		return (e1.getClass().equals(e2.getClass()));
		
	}
	
}