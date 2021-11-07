package ds.doublylinkedlist;

/*
 * Capítulo 4 - Lista Duplamente Ligadas.
 */
public class DoublyLinkedList {

	private Cell first = null;
	private Cell end = null;
	private int totalOfElements = 0;

	public void addFirst(Object element) {
		if (this.totalOfElements == 0) {
			Cell newCell = new Cell(element);
			this.first = newCell;
			this.end = newCell;
		} else {
			Cell newCell = new Cell(element, first);
			this.first.setPrevious(newCell);
			this.first = newCell;
		}
		this.totalOfElements++;
	}

	public void addEnd(Object element) {
		if (this.totalOfElements == 0) {
			addFirst(element);
		} else {
			Cell newCell = new Cell(element);
			this.end.setNext(newCell);
			newCell.setPrevious(end);
			this.end = newCell;
			this.totalOfElements++;
		}
	}

	public void addMiddle(int position, Object element) {
		if (position == 0) {
			addFirst(element);
		} else if (position == this.totalOfElements) {
			this.addEnd(element);
		} else {
			Cell previous = getCell(position - 1);
			Cell next = previous.getNext();

			Cell newCell = new Cell(element, previous.getNext());
			newCell.setPrevious(previous);
			previous.setNext(newCell);
			next.setPrevious(newCell);
			this.totalOfElements++;
		}
	}

	public Object get(int position) {
		return this.getCell(position).getElement();
	}

	public void removeMiddle(int position) {
		if (position == 0) {
			this.removeFirst();
		} else if (position == this.totalOfElements - 1) {
			this.removeEnd();
		} else {
			Cell previous = this.getCell(position - 1);
			Cell current = previous.getNext();
			Cell next = current.getNext();

			previous.setNext(next);
			next.setPrevious(previous);

			this.totalOfElements--;
		}
	}

	public void removeFirst() {
		if (this.totalOfElements == 0) {
			throw new IllegalArgumentException("lista vazia");
		}

		this.first = this.first.getNext();
		this.totalOfElements--;

		if (this.totalOfElements == 0) {
			this.end = null;
		}
	}

	public void removeEnd() {
		if (this.totalOfElements == 1) {
			this.removeFirst();
		} else {
			Cell penult = this.end.getPrevious();
			penult.setNext(null);
			this.end = penult;
			this.totalOfElements--;
		}
	}

	public int size() {
		return this.totalOfElements;
	}

	public boolean contains(Object element) {

		Cell current = this.first;

		while (current != null) {
			if (current.getElement().equals(element)) {
				return true;
			}
			current = current.getNext();
		}
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
