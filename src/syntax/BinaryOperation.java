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
	
	public Object eval() {
		Object o1 = e1.eval();
		Object o2 = e2.eval();
		if (o1 == null || o2 == null) {
			System.out.println("Runtime Error!");
		}
		
		switch(this.op){
		case plus:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1+i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case minus:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1-i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case times:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1*i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case devide:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1/i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case biggerThan:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1>i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case lessThan:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1<i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case equal:
			try {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1==i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case and:
			try {
				boolean i1 = (Boolean)o1;
				boolean i2 = (Boolean)o2;
				return i1&&i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		case or:
			try {
				boolean i1 = (Boolean)o1;
				boolean i2 = (Boolean)o2;
				return i1||i2;
			}catch (Exception e) {
				System.out.println("Type Error!");
			}			
			break;
		}
		
		return null;
	}
}