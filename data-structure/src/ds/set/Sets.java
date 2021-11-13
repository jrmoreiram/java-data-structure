package ds.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sets {
	private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

	public Sets() {
		for (int i = 0; i < 26; i++) {
			table.add(new LinkedList<String>());
		}
	}

	private int calculateIndexTable(String word) {
		return word.toLowerCase().charAt(0) % 26;
	}

	public void addWord(String word) {
		if (!contains(word)) {
			int index = calculateIndexTable(word);
			List<String> list = table.get(index);
			list.add(word);
		}
	}

	private boolean contains(String word) {
		int index = calculateIndexTable(word);
		return table.get(index).contains(word);
	}

	public void removeWord(String word) {
		if (contains(word)) {
			int index = calculateIndexTable(word);
			List<String> list = table.get(index);
			list.remove(word);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return table.toString();
	}
}
