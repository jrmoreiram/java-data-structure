package ds;

import java.util.Arrays;

/*
 * Classe com exemplo de estrutura de dados de armazenamento sequencial(ARRAY).
 */
public class Vetor {

	private Student[] students = new Student[100];
	private int totalOfStudents = 0;

	public void addAluno(Student student) {
		this.students[totalOfStudents] = student;
		totalOfStudents++;
	}

	public Student getAluno(int position) {
		return null;
	}

	public void removeAluno(int position) {

	}

	public boolean containsStudent(Student student) {

		for (int i = 0; i < students.length; i++) {
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
