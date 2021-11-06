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
        
        list.addMiddle(2, "Gabriel");
        System.out.println(list);
        
        Object x = list.get(2);
        System.out.println(x);
        
        System.out.println(list.size());
        
        list.removeFirst();
        System.out.println(list);
        
        System.out.println(list.size());
    }
}