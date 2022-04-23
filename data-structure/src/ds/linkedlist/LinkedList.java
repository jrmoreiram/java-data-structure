package ds.linkedlist;

/*
 * Capitulo 3 - Lista Ligadas.
 */
public class LinkedList {

	private Cell first = null;
	private Cell end = null;
	private int totalOfElements = 0;

	public void addFirst(Object element) {
		Cell newCell = new Cell(element, first);
		this.first = newCell;

		if (this.totalOfElements == 0) {
			this.end = this.first;
		}

		this.totalOfElements++;
	}

	public void addEnd(Object element) {
		if (this.totalOfElements == 0) {
			addFirst(element);
		} else {
			Cell newCell = new Cell(element, null);
			this.end.setNext(newCell);
			this.end = newCell;
			this.totalOfElements++;
		}
	}

	public void addMiddle(int position, Object element) {
		if (position == 0) {
			addFirst(element);
		} else if (position == this.totalOfElements) {
			addEnd(element);
		} else {
			Cell previous = this.getCell(position - 1);
			Cell newCell = new Cell(element, previous.getNext());

			previous.setNext(newCell);
			this.totalOfElements++;
		}
	}

	public Object get(int position) {
		return this.getCell(position).getElement();
	}

	public void removeMiddle(int position) {}
		
	public void removeFirst() {
		if(this.totalOfElements == 0) {
	        throw new IllegalArgumentException("lista vazia");
	    }

	    this.first = this.first.getNext();
	    this.totalOfElements--;

	    if(this.totalOfElements == 0) {
	        this.end = null;
	    }
	}

	public int size() {
		return this.totalOfElements;
	}

	public boolean contains(Object element) {
		return false;
	}

	@Override
	public String toString() {

		if (this.totalOfElements == 0) {
			return "[]";
		}

		Cell current = first;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalOfElements; i++) {
			builder.append(current.getElement());
			builder.append(",");

			current = current.getNext();
		}

		builder.append("]");

		return builder.toString();
	}

	private boolean positionOccupied(int position) {
		return position >= 0 && position < this.totalOfElements;
	}

	private Cell getCell(int position) {

		if (!positionOccupied(position)) {
			throw new IllegalArgumentException("posicao inexistente");
		}

		Cell current = first;

		for (int i = 0; i < position; i++) {
			current = current.getNext();
		}
		return current;
	}
}
