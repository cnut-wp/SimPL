package syntax;

public class PairValue extends Value{
	Value first;
	Value second;
	
	public PairValue(Value f, Value s) {
		first = f;
		second = s;
	}

	public String toString(){
		return "(" + first.toString() + ", " + second.toString() + ")";
	}
	
	public Value eval() {
		return this;
	}
	
	public BoolValue equal(Value anValue){
		if (anValue == null){
			return new BoolValue(false);
		}
		if (anValue instanceof PairValue){
			PairValue anP = (PairValue) anValue;
			boolean fst = (first.equal(anP.first)).value;
			boolean snd = (second.equal(anP.second)).value;
			return new BoolValue(fst&&snd);
		}
		return new BoolValue(false);
	}
}