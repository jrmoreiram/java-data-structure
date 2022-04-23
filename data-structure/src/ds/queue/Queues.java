package ds.queue;

import java.util.LinkedList;
import java.util.List;

/*
 * Capitulo 6 - Filas.
 */
public class Queues {
	
	private List<String> students = new LinkedList<String>();
	
	public void addStudent(String staudent) {
	    students.add(staudent);
	}
	
	public String removeStudent() {
		return students.remove(0);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return students.toString();
	}

}
