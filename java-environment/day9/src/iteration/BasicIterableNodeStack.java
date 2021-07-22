package iteration;

import java.util.Iterator;

/*
 * The Following class is an altered version of the NodeStack
 * class from the Day8 code examples. Note that the Node class
 * referred to below exists within this same file. This is a
 * more accurate representation for how JRE Collections manage
 * their specific classes.
 */
public class BasicIterableNodeStack implements Iterable<Node> {
	private Node top;
	
	/*
	 * 'cursor' is used to track which node 
	 * is 'next' in the iterator
	 */
	private Node cursor;
	
	public void push(int element) {
		Node node = new Node(element);
		push(node);
	}
	
	public void push(Node node) {
		node.setNext(top);
		this.top = (node);
		this.cursor = top;
	}
	
	public Node pop() {
		Node poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public Node peek() {
		return top;
	}
	
	/*
	 * The Iterable Interface provides the iterator method. Should should
	 * return an object that implements the 'Iterator' interface.
	 */
	@Override
	public Iterator<Node> iterator() {
		return new NodeIterator();
	}
	
	/*
	 * 'NodeIterator' is a nested class, i.e. a class created
	 * within another. Recall that A class is simply a template 
	 * to create objects. 
	 * 
	 * Nested classes allow you to consolidate more complex objects 
	 * within the scope of where that object would be used. In 
	 * this case, the NodeIterator class will control how we 
	 * 'move through' a Node Stack, so it only needs to exist within
	 * the NodeStack's context
	 */
	private class NodeIterator implements Iterator<Node> {
		NodeIterator() {
			cursor = top;
		}
		
		/*
		 * hasNext is a method from the Iterator interface.
		 * The hasNext method should return a boolean and
		 * define when other objects still 'exist' within 
		 * the collection.
		 */
		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;
			
			return false;
		}

		/*
		 * next is a method from the Iterator interface
		 * The next method should return a reference for
		 * information that exists within a collection. Note
		 * that our implementation has a predictable way
		 * to determine which value should come 'next', but
		 * this is NOT the case for many collections within
		 * the JRE
		 */
		@Override
		public Node next() {
			Node ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();
			
			return ret;
		}
	}
}

/*
 * The following is a simple Node class (similar to our Day8 Example)
 * here, because we are only planning to use this Node within
 * the context of this class and potentially other classes within
 * this package.
 */
class Node {
	private Integer data;
	
	private Node next;
	
	public Node(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
