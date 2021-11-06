package ds.linkedlist;

public class LinkedListTest {
	
	public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list);
        list.addFirst("Mauricio");
        System.out.println(list);
        list.addFirst("Paulo");
        System.out.println(list);
        list.addFirst("Guilherme");
        System.out.println(list);
        
        list.addEnd("Marcelo");
        System.out.println(list);
    }

}
