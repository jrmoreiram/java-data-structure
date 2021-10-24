package ds.vectors;

import java.util.ArrayList;

public class VectorTest {
	public static void main(String[] args) {
		
		Student s1 = new Student("Joao");
		Student s2 = new Student("Jose");
		
		Vector list = new Vector();
		
		System.out.println(list.size());
		list.addStudent(s1);
		System.out.println(list.size());
		list.addStudent(s2);
		System.out.println(list.size());
		
		System.out.println(list);
		
		System.out.println(list.containsStudent(s1));
		
		Student s3 = new Student("Danilo");
		System.out.println(list.containsStudent(s3));
		
//		Test invalid position.
//		Student x = list.getStudent(158);
//		System.out.println(x);
		
		list.addStudent(1, s3);
		System.out.println(list);
		
		list.removeStudent(1);
		System.out.println(list);
		
		for (int i = 0; i < 300; i++) {
			Student y = new Student("Joao" + i);
			list.addStudent(y);
		}
		
		System.out.println(list);
		
		
		//Implementação de vetor na especificação Java.
		ArrayList<Student> listOfJava = new ArrayList<Student>();
		listOfJava.add(s2);
		listOfJava.add(1, s2);
		listOfJava.remove(1);
	}
}
