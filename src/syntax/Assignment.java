package syntax;

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
				throw new Exception("Runtime Error!");
			}
			if (!(isTypeEqual(old, newValue)))
			{
				System.out.println("Type Error!");
				throw new Exception("Type Error!");
			} else {
				Interpreter.symbolTable.set(variable, newValue);
			}
			return new Nop();
		} catch (Exception e){
			if (Interpreter.debug)
				System.out.println(e.toString());
			System.exit(-1);
		}
		return new Nop();
	}
	
	
	private boolean isTypeEqual(Value oldValue, Value newValue){
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
		return (e1.getClass().equals(e2.getClass()));
		
	}
}