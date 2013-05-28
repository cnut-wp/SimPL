import java.util.ArrayList;
import java.util.Map.Entry;

import syntax.Value;

public class SymbolTable {
	static ArrayList<Entry<String,Value>> table = new ArrayList<Entry<String,Value>>();
	static void push(Entry<String,Value> e) {
		table.add(e);
	}
	static int getSize() {
		return table.size();
	}
	static void popTo(int i) {
		while (i<table.size()) 
			table.remove(table.size()-1);	
	}
}

