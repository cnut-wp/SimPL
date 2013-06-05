package syntax;

import syntax.BinaryOperation.BinaryOperator;
import syntax.UnaryOperation.UnaryOperator;
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
		Expression e1 = thenClause;
		Expression e2 = elseClause;
		while (e1 instanceof Sequence){
			e1 = ((Sequence)(e1)).e2;
		}
		while (e2 instanceof Sequence){
			e2 = ((Sequence)(e2)).e2;
		}
		if (e1 instanceof Variable || e2 instanceof Variable){
			return true;
		}
		if (e1 instanceof Application || e2 instanceof Application){
			return true;
		}
		
		
		if (e1.getClass().equals(e2.getClass())){
			if (e1.getClass().equals(AnonymousFunction.class)){
				AnonymousFunction a1 = (AnonymousFunction) e1;
				AnonymousFunction a2 = (AnonymousFunction) e2;
				return twoAnonFunTypeEqual(a1, a2);
			} else {
				return true;
			}
		} else if ((e1 instanceof List) && (e2 instanceof Nil)){
			return true;			
		} else if ((e1 instanceof Nil) && (e2 instanceof List)){
			return true;			
		} else if ((e1 instanceof ListValue) && (e2 instanceof Nil)){
			return true;			
		} else if ((e1 instanceof Nil) && (e2 instanceof ListValue)){
			return true;			
		} else if ((e1 instanceof IntValue) && (e2 instanceof BinaryOperation)){
			if (((BinaryOperation)(e2)).op == BinaryOperator.plus ||
				((BinaryOperation)(e2)).op == BinaryOperator.minus ||
				((BinaryOperation)(e2)).op == BinaryOperator.times ||
				((BinaryOperation)(e2)).op == BinaryOperator.devide
					)
				return true;
			else
				return false;
		 } else if ((e2 instanceof IntValue) && (e1 instanceof BinaryOperation)){
			if (((BinaryOperation)(e1)).op == BinaryOperator.plus ||
					((BinaryOperation)(e1)).op == BinaryOperator.minus ||
					((BinaryOperation)(e1)).op == BinaryOperator.times ||
					((BinaryOperation)(e1)).op == BinaryOperator.devide
						)
					return true;
				else
					return false;
		 } else if ((e1 instanceof BoolValue) && (e2 instanceof BinaryOperation)){
			if ( ! (
					((BinaryOperation)(e2)).op == BinaryOperator.plus ||
					((BinaryOperation)(e2)).op == BinaryOperator.minus ||
					((BinaryOperation)(e2)).op == BinaryOperator.times ||
					((BinaryOperation)(e2)).op == BinaryOperator.devide
			       ))
					return true;
				else
					return false;
	    } else if ((e2 instanceof BoolValue) && (e1 instanceof BinaryOperation)){
				if ( !(
						((BinaryOperation)(e1)).op == BinaryOperator.plus ||
						((BinaryOperation)(e1)).op == BinaryOperator.minus ||
						((BinaryOperation)(e1)).op == BinaryOperator.times ||
						((BinaryOperation)(e1)).op == BinaryOperator.devide
					))
						return true;
					else
						return false;
	    } 
		/****************** unaryOperation **************************************/
	    else if ((e1 instanceof IntValue) && (e2 instanceof UnaryOperation)){
	    	if (((UnaryOperation)(e1)).op == UnaryOperator.negative)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((e2 instanceof IntValue) && (e1 instanceof UnaryOperation)){
	    	if (((UnaryOperation)(e2)).op == UnaryOperator.negative)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((e1 instanceof BoolValue) && (e2 instanceof UnaryOperation)){
	    	if (((UnaryOperation)(e1)).op == UnaryOperator.not)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((e2 instanceof BoolValue) && (e1 instanceof UnaryOperation)){
	    	if (((UnaryOperation)(e2)).op == UnaryOperator.not)
	    		return true;
	    	else
	    		return false;	    	
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