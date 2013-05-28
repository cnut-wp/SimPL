package symbol;
import java.util.ArrayList;


import syntax.*;

public class SymbolTable {
	static ArrayList<Entry> table = new ArrayList<Entry>();
	
	public static void push(Variable name,Object value) {
		Entry e = new Entry(name , value);
		table.add(e);
	}
	public static int getSize() {
		return table.size();
	}
	public static void popTo(int i) {
		while (i<table.size()) 
			table.remove(table.size()-1);	
	}
	public static Object get(Variable variable) {
		// TODO Auto-generated method stub
		for (int i = table.size()-1; i>=0; i--)
			if (variable.equal(table.get(i).name)) return table.get(i).value;
		return null;
	}
}

class Entry {
	Variable name;
	Object value;
	public Entry(Variable n, Object v) {
		name = n; value = v;
	}
}