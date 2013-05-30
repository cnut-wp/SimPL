package syntax;

import interpreter.Interpreter;

public class Assignment extends Expression{
	Expression var;
	Expression val;
	
	public String toString(){
		return var.toString() + " := " + val.toString();
	}
	public Assignment(Object yysv, Object yysv2){
		var = (Expression) yysv;
		val = (Expression) yysv2;
	}
	public Value eval() {
		if (var == null || val == null){
			System.out.println("Rutime Error");
		}
		try {
			Variable variable = (Variable)var;
			Value old = Interpreter.symbolTable.get(variable);
			Value newValue = val.eval();
			if (old == null || !(old.getClass().equals(newValue.getClass())))
			{
				throw new Exception("Type Error");
			} else {
				Interpreter.symbolTable.set(variable, newValue);
			}
			return new Nop();
		} catch (Exception e){
			System.out.println(e.toString());
		}
		return new Nop();
	}
}