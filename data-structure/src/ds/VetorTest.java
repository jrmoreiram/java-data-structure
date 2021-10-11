package ds;

public class VetorTest {
	public static void main(String[] args) {
		
		Student s1 = new Student("Joao");
		Student s2 = new Student("Jose");
		
		Vetor list = new Vetor();
		
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
		
		list.addStudentInTheMiddle(1, s3);
		System.out.println(list);
		
		list.removeStudent(1);
		System.out.println(list);
	}
}
