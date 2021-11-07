package ds.doublylinkedlist;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		System.out.println("emptyList:" + list);
		list.addFirst("Mauricio");
		System.out.println("addFirst:" + list);
		list.addFirst("Paulo");
		System.out.println("addFirst:" + list);
		list.addFirst("Guilherme");
		System.out.println("addFirst:" + list);

		list.addEnd("Marcelo");
		System.out.println("addEnd:" + list);

		list.addMiddle(2, "Gabriel");
		System.out.println("addMiddle(2, 'Gabriel'):" + list);

		Object x = list.get(2);
		System.out.println("get(2):" + x);

		System.out.println("sizeList:" + list.size());

		list.removeFirst();
		System.out.println("removeFirst:" + list);

		list.removeEnd();
		System.out.println("removeEnd:" + list);

		list.removeMiddle(2);
		System.out.println("removeMiddle(2):" + list);

		System.out.println("contains('Paulo'):" + list.contains("Paulo"));
		System.out.println("contains('Danilo'):" + list.contains("Danilo"));

		System.out.println("sizeList:" + list.size());
	}
}