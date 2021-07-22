package iteration;

import java.util.Iterator;
import generics.GenericNode;

/*
 * This is an altered version of our BasicIterableNodeStack class.
 * This version simply introduces Generics
 */
public class GenericIterableNodeStack<Placeholder> implements Iterable<GenericNode<Placeholder>> {
	private GenericNode<Placeholder> top;

	private GenericNode<Placeholder> cursor;
	
	public void push(Placeholder element) {
		GenericNode<Placeholder> node = new GenericNode<Placeholder>(element);
		push(node);
	}
	
	public void push(GenericNode<Placeholder> node) {
		node.setNext(top);
		this.top = (node);
		this.cursor = top;
	}
	
	public GenericNode<Placeholder> pop() {
		GenericNode<Placeholder> poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public GenericNode<Placeholder> peek() {
		return top;
	}
	
	@Override
	public Iterator<GenericNode<Placeholder>> iterator() {
		return new NodeIterator();
	}
	
	private class NodeIterator implements Iterator<GenericNode<Placeholder>> {
		NodeIterator() {
			cursor = top;
		}
		
		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;
			
			return false;
		}

		@Override
		public GenericNode<Placeholder> next() {
			GenericNode<Placeholder> ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();
			
			return ret;
		}
	}
}
