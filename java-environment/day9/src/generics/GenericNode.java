package generics;

/*
 * The Following Class is an altered version of the Node
 * class we created in the Day 8 Code Examples.
 */
public class GenericNode<T> {
	private T data;
	private GenericNode<T> next;

	public GenericNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenericNode<T> getNext() {
		return next;
	}

	public void setNext(GenericNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
