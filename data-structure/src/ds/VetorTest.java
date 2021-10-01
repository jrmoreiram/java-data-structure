package ds;

public class VetorTest {
	public static void main(String[] args) {
		
		Student s1 = new Student("Joao");
		Student s2 = new Student("Jose");
		
		Vetor list = new Vetor();
		
		System.out.println(list.size());
		list.addAluno(s1);
		System.out.println(list.size());
		list.addAluno(s2);
		System.out.println(list.size());
		
		System.out.println(list);
		
		System.out.println(list.containsStudent(s1));
		
		Student s3 = new Student("Danilo");
		
		System.out.println(list.containsStudent(s3));
	}
}
