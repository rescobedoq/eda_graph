public class ListLinked <E> {
	Node<E> first; 
	
	public ListLinked() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return this.first == null; 
	}
	public boolean search(E x) {
		Node<E> aux = this.first;
		for(; aux != null; aux = aux.getNext()) {
			if (aux.getData().equals(x)) {
				return true;
			}
		}
		return false;
	}
	
	public E searchNode(E x) {
		Node<E> aux = this.first;
		for(; aux != null; aux = aux.getNext()) {
			if (aux.getData().equals(x)) {
				return aux.getData();
			}
		}
		return null;
	}
	
	public void insertFirst(E x) {
		first = new Node<E>(x, this.first);
	}
	public void insertLast(E x) {
		if (this.isEmpty()) {
			this.insertFirst(x); 
		}
		else {
			Node <E> aux = this.first;
			while (aux != null && aux.getNext() != null)
				aux = aux.getNext(); 
			if (aux != null) {
				aux.setNext(new Node<E> (x)); 
			}
		}
	}
	public void remove(E x) {
		if (this.first != null && this.first.getData().equals(x)) { 
			this.first = this.first.getNext();
		}
		else {
			Node<E> aux = this.first;
			while (aux.getNext() != null && !aux.getNext().getData().equals(x)) {
				aux = aux.getNext();
			}
			if (aux.getNext()!= null) {
				aux.setNext(aux.getNext().getNext());
			}
		}
	}
	
	
	public String toString() {
		String str = "";
		for(Node<E> aux = this.first; aux != null; aux = aux.getNext()) { 
			str = str + aux.toString() + ", "; 
		}
		return str;
	}
}
