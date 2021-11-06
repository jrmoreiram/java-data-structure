package ds.linkedlist;

public class LinkedList {
	
	private Cell first = null;
	private Cell end = null;
	private int totalOfElements = 0;
	
	public void addFirst(Object element) {
		Cell newCell = new Cell(element, first);
		this.first = newCell;
		
		 if(this.totalOfElements == 0) {
	            this.end = this.first;
	        }
		
		this.totalOfElements++;
	}

    public void addEnd(Object element) {
    	 if(this.totalOfElements == 0) {
    	        addFirst(element);
    	    } else {
	    	 Cell newCell = new Cell(element, null);
	    	    this.end.setNext(newCell);
	    	    this.end = newCell;
	    	    this.totalOfElements++;
    	}
    }

    public void addMiddle(int position, Object element) {}

    public Object get(int position) { return null; }

    public void remove(int position) {}

    public int size() { return 0; }

    public boolean contain(Object o) { return false;}
    
    @Override
    public String toString () {

        if(this.totalOfElements == 0) {
            return "[]";
        }

        Cell atual = first;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalOfElements; i++) {
            builder.append(atual.getElement());
            builder.append(",");

            atual = atual.getNext();
        }

        builder.append("]");

        return builder.toString();
    }

}
