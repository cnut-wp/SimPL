package symbol;
import java.util.ArrayList;


import syntax.*;

public class SymbolTable implements Cloneable{
	public ArrayList<Entry> table = new ArrayList<Entry>();
	
	public void push(Variable name, Object value) {
		Entry e = new Entry(name , value);
		table.add(e);
	}
	public int getSize() {
		return table.size();
	}
	public void popTo(int i) {
		while (i<table.size()) 
			table.remove(table.size()-1);	
	}
	public Object get(Variable variable) {
		// TODO Auto-generated method stub
		for (int i = table.size()-1; i>=0; i--)
			if (variable.equal(table.get(i).name)) return table.get(i).value;
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public Object clone() {
		SymbolTable st = null;
		try {
			st = (SymbolTable) super.clone();
			st.table = (ArrayList<Entry>) this.table.clone();
			return st;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}

class Entry {
	Variable name;
	Object value;
	public Entry(Variable n, Object v) {
		name = n; value = v;
	}
}