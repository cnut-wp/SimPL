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
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug == true){
				e.printStackTrace();
			}
			System.exit(-1);
		}
	}
	public Value eval() {
		if (var == null || val == null){
			Interpreter.out.println("Rutime Error!");
			System.exit(-1);
		}
		try {
			Variable variable = (Variable)var;
			Value old = Interpreter.symbolTable.get(variable);
			Value newValue = val.eval();
			if (old == null){
				Interpreter.out.println("Runtime Error!");
				System.exit(-1);
			}
			if (!(Util.twoExprTypeEqual(old, newValue)))
			{
				Interpreter.out.println("Type Error!");
				System.exit(-1);
			} else {
				Interpreter.symbolTable.set(variable, newValue);
			}
			return new Nop();
		} catch (Exception e){
			Interpreter.out.println("Type Error!");
			if (Interpreter.debug)
				Interpreter.out.println(e.toString());
			System.exit(-1);
		}
		return new Nop();
	}
}