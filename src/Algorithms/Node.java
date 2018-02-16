package Algorithms;

class Node<E> {
	private E element;
	private Node<E> next;
	
	public Node(E element) { 			//1e constructor
		this.element = element;
		next = null;
	}
	
	public Node(E element, Node<E> next) {	//2e constructor
		this.element = element;
		this.next = next;
	}
	
	public E getElement() { 			//E is return type
		return element;
	}
	
	public Node<E> getNext(){			//Node<E> is return type
		return next;
	}
}
