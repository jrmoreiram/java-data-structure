package ds.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		Sets set = new Sets();
		set.addWord("Mauricio");
		System.out.println("set1:" + set);

		set.addWord("Mauricio");
		System.out.println("set2:" + set);

		set.addWord("Mauricio");
		System.out.println("set3:" + set);

		set.addWord("Mauricio");
		System.out.println("set4:" + set);

		set.addWord("Marcelo");
		set.addWord("Guilherme");
		System.out.println("set5:" + set);
		
		set.removeWord("Mauricio");
		System.out.println("removeWord('Mauricio'):" + set);
		
	    //Implementação java para conjuntos.
	       Set<String> javaSet = new HashSet<String>();

	       javaSet.add("Mauricio");
	       javaSet.add("Marcelo");
	       javaSet.add("Guilherme");
	       System.out.println("javaSet:" + javaSet);
	       
	       String x = "Guilherme";
	       x.hashCode();
	       System.out.println(x);
	}
}
