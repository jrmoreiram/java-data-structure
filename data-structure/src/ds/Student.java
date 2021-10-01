package ds;

public class Student {
	private String name;

	public Student(String nome) {
		this.name = nome;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student other = (Student) obj;
		return other.getName().equals(this.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}