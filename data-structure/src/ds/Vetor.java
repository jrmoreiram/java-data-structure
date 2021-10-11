package ds;

import java.util.Arrays;

/*
 * Classe com exemplo de estrutura de dados de armazenamento sequencial(ARRAY).
 */
public class Vetor {

	private Student[] students = new Student[100];
	private int totalOfStudents = 0;

	public void addStudent(Student student) {
		this.students[totalOfStudents] = student;
		totalOfStudents++;
	}
	
	private boolean validPosition(int position) {
		return position >= 0 && position <= totalOfStudents;
	}
	
	public void addStudentInTheMiddle(int position, Student student) {
		
		if (!validPosition(position)) {
			throw new IllegalArgumentException("Position Invalid.");
			
		}
		
		for(int i = totalOfStudents -1; i >= position; i-=1 ) {
			students[i+1] = students[i];
		}
		students[position] = student;
		totalOfStudents++;
	}
	
	
	private boolean positionCompleted(int position) {
		return position >=0 && position < totalOfStudents;
	}

	public Student getStudent(int position) {
		
		if (!positionCompleted(position)) {
			throw new IllegalArgumentException("Position Invalid.");
			
		}
		
		return students[position];
	}

	public void removeStudent(int position) {
		
		for(int i = position; i < this.totalOfStudents -1; i++) {
			this.students[i] = this.students[i+1];
		}
		totalOfStudents--;
		this.students[totalOfStudents] = null;
	}

	public boolean containsStudent(Student student) {

		for (int i = 0; i < totalOfStudents; i++) {
			if (student.equals(students[i])) {
				return true;
			}
		}

		return false;
	}

	public int size() {
		return totalOfStudents;
	}

	public String toString() {
		return Arrays.toString(students);
	}

}
