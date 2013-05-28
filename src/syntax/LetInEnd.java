package syntax;

public class LetInEnd extends Expression{
	Variable x;
	Expression definition;
	Expression body;
	
	public String toString(){
		return "let " + x.toString() + " = " + definition.toString() + " in " + body.toString() + " end";
	}
	
	public LetInEnd(Object v ,Object def , Object body) {
		x = (Variable) v;
		definition = (Expression) def;
		this.body = (Expression) body; 
	}
}