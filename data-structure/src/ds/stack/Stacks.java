package ds.stack;

import java.util.LinkedList;
import java.util.List;

/*
 * Capitulo 5 - Pilhas.
 */
public class Stacks {
	
	private List<String> names = new LinkedList<String>();

	public void push(String name) {
		names.add(name);
	}
	
	public String pop() {
		return names.remove(names.size()-1);
	}
	
	public boolean empty() {
		return names.isEmpty();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return names.toString();
	}
}
