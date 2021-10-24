package ds.vectors;

import java.util.Arrays;

/*
 * Capítulo 2 - Armazenamento sequencial e Vetores(Arrays).
 */
public class Vector {

	private Student[] students = new Student[100];
	private int totalOfStudents = 0;

	public void addStudent(Student student) {
		this.resizeArray();
		
		this.students[totalOfStudents] = student;
		totalOfStudents++;
	}
	
	private boolean validPosition(int position) {
		return position >= 0 && position <= totalOfStudents;
	}
	
	private void dinamicSize() {
		resizeArray();
	}

	private void resizeArray() {
		if (totalOfStudents == students.length) {
			Student[] newStudentArray = new Student[students.length*2];
			for(int i = 0; i < students.length; i++) {
				newStudentArray[i] = students[i];
			}
			this.students = newStudentArray;
		}
	} 
	
	public void addStudent(int position, Student student) {
		this.resizeArray();
		
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
