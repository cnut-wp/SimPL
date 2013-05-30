package syntax;

public class BinaryOperation extends Expression{
	public enum BinaryOperator{
		plus, minus, times, devide, biggerThan, lessThan, equal, and, or
	}
	
	Expression e1;
	Expression e2;
	BinaryOperator op;
	
	public BinaryOperation(Object yysv, BinaryOperator op, Object yysv2) {
		this.e1 = (Expression) yysv;
		this.op = op;
		this.e2 = (Expression) yysv2;
	}
	
	public String toString(){
		String operator = "";
		switch(this.op){
		case plus:
			operator = "+"; break;
		case minus:
			operator = "-"; break;
		case times:
			operator = "*"; break;
		case devide:
			operator = "/"; break;
		case biggerThan:
			operator = ">"; break;
		case lessThan:
			operator = "<"; break;
		case equal:
			operator = "="; break;
		case and:
			operator = "and"; break;
		case or:
			operator = "or"; break;
		}
		return e1.toString() + " " + operator + " " + e2.toString();
	}
	
	public Value eval() {
		Value o1 = e1.eval();
		Value o2 = e2.eval();
		if (o1 == null || o2 == null) {
			System.out.println("Runtime Error!");
		}
		
		switch(this.op){
		case plus:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				return new IntValue(i1+i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case minus:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				return new IntValue(i1-i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case times:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				return new IntValue(i1*i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case devide:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				/*
				 * TODO: div-0
				 */
				if (i2 == 0){
					IntValue ret = new IntValue(0);
					ret.isUndef=true;
					System.out.println("div0, return value is undef");
					return ret;
				}else {
					return new IntValue(i1/i2);
				}
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case biggerThan:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				return new BoolValue(i1>i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case lessThan:
			try {
				int i1 = ((IntValue)o1).value;
				int i2 = ((IntValue)o2).value;
				return new BoolValue(i1<i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case equal:
			/*
			 * TODO: equal can be arbitrary type
			 */
			try {
				if (o1.getClass().equals(o2.getClass()))
					return o1.equal(o2);
				else 
					throw new Exception("Type Error");
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case and:
			try {
				boolean i1 = ((BoolValue)o1).value;
				boolean i2 = ((BoolValue)o2).value;
				return new BoolValue(i1&&i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case or:
			try {
				boolean i1 = ((BoolValue)o1).value;
				boolean i2 = ((BoolValue)o2).value;
				return new BoolValue(i1||i2);
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		}
		
		return null;
	}
}