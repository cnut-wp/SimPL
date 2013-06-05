package syntax;

import syntax.BinaryOperation.BinaryOperator;
import syntax.UnaryOperation.UnaryOperator;
import interpreter.Interpreter;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public String toString(){
		return var.toString() + " := " + val.toString();
	}
	public Assignment(Object yysv, Object yysv2){
		try {
			var = (Expression) yysv;
			val = (Expression) yysv2;
		} catch ( Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	public Value eval() {
		if (var == null || val == null){
			System.out.println("Rutime Error!");
			System.exit(-1);
		}
		try {
			Variable variable = (Variable)var;
			Value old = Interpreter.symbolTable.get(variable);
			Value newValue = val.eval();
			if (old == null){
				System.out.println("Runtime Error!");
				System.exit(-1);
			}
			if (!(isTwoValueTypeEqual(old, newValue)))
			{
				System.out.println("Type Error!");
				System.exit(-1);
			} else {
				Interpreter.symbolTable.set(variable, newValue);
			}
			return new Nop();
		} catch (Exception e){
			System.out.println("Type Error!");
			if (Interpreter.debug)
				System.out.println(e.toString());
			System.exit(-1);
		}
		return new Nop();
	}
	
	
	private boolean isTwoValueTypeEqual(Value oldValue, Value newValue){
		if (oldValue.getClass().equals(newValue.getClass())){
			if (oldValue.getClass().equals(AnonymousFunction.class)){
				AnonymousFunction a1 = (AnonymousFunction) oldValue;
				AnonymousFunction a2 = (AnonymousFunction) newValue;
				return twoAnonFunTypeEqual(a1, a2);
			} else {
				return true;
			}
		} else if ((oldValue instanceof ListValue) && (newValue instanceof Nil)){
			return true;			
		} else if ((oldValue instanceof Nil) && (newValue instanceof ListValue)){
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
		return (isExprTypeEqual(e1, e2));
		
	}
	
	/*
	 * old is narrow, new is board, will be not equal
	 */
	private boolean isExprTypeEqual(Expression oldExp, Expression newExp){
		while (oldExp instanceof Sequence){
			oldExp = ((Sequence)(oldExp)).e2;
		}
		while (newExp instanceof Sequence){
			newExp = ((Sequence)(newExp)).e2;
		}
		if (oldExp instanceof Variable){
			return true;
		}
		// explicit judge
		if (!(oldExp instanceof Variable) && (newExp instanceof Variable)){
			return false;
		} 
		if (oldExp instanceof Application || newExp instanceof Application){
			return true;
		}
		
		if (oldExp.getClass().equals(newExp.getClass())){
			return true;
		} else if ((oldExp instanceof List) && (newExp instanceof Nil)){
			return true;			
		} else if ((oldExp instanceof Nil) && (newExp instanceof List)){
			return true;			
		} else if ((oldExp instanceof ListValue) && (newExp instanceof Nil)){
			return true;			
		} else if ((oldExp instanceof Nil) && (newExp instanceof ListValue)){
			return true;			
		} else if ((oldExp instanceof IntValue) && (newExp instanceof BinaryOperation)){
			if (((BinaryOperation)(newExp)).op == BinaryOperator.plus ||
				((BinaryOperation)(newExp)).op == BinaryOperator.minus ||
				((BinaryOperation)(newExp)).op == BinaryOperator.times ||
				((BinaryOperation)(newExp)).op == BinaryOperator.devide
					)
				return true;
			else
				return false;
		 } else if ((newExp instanceof IntValue) && (oldExp instanceof BinaryOperation)){
			if (((BinaryOperation)(oldExp)).op == BinaryOperator.plus ||
					((BinaryOperation)(oldExp)).op == BinaryOperator.minus ||
					((BinaryOperation)(oldExp)).op == BinaryOperator.times ||
					((BinaryOperation)(oldExp)).op == BinaryOperator.devide
						)
					return true;
				else
					return false;
		 } else if ((oldExp instanceof BoolValue) && (newExp instanceof BinaryOperation)){
			if ( ! (
					((BinaryOperation)(newExp)).op == BinaryOperator.plus ||
					((BinaryOperation)(newExp)).op == BinaryOperator.minus ||
					((BinaryOperation)(newExp)).op == BinaryOperator.times ||
					((BinaryOperation)(newExp)).op == BinaryOperator.devide
			       ))
					return true;
				else
					return false;
	    } else if ((newExp instanceof BoolValue) && (oldExp instanceof BinaryOperation)){
				if ( !(
						((BinaryOperation)(oldExp)).op == BinaryOperator.plus ||
						((BinaryOperation)(oldExp)).op == BinaryOperator.minus ||
						((BinaryOperation)(oldExp)).op == BinaryOperator.times ||
						((BinaryOperation)(oldExp)).op == BinaryOperator.devide
					))
						return true;
					else
						return false;
	    } 
		/****************** unaryOperation **************************************/
	    else if ((oldExp instanceof IntValue) && (newExp instanceof UnaryOperation)){
	    	if (((UnaryOperation)(oldExp)).op == UnaryOperator.negative)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((newExp instanceof IntValue) && (oldExp instanceof UnaryOperation)){
	    	if (((UnaryOperation)(newExp)).op == UnaryOperator.negative)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((oldExp instanceof BoolValue) && (newExp instanceof UnaryOperation)){
	    	if (((UnaryOperation)(oldExp)).op == UnaryOperator.not)
	    		return true;
	    	else
	    		return false;	    	
	    } else if ((newExp instanceof BoolValue) && (oldExp instanceof UnaryOperation)){
	    	if (((UnaryOperation)(newExp)).op == UnaryOperator.not)
	    		return true;
	    	else
	    		return false;	    	
	    }
		return false;
	}
}