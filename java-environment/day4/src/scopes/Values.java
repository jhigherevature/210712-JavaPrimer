package scopes;

/*
 * This example shows some slight complex and honestly a bit
 * convaluted approach to keep track of every object created
 * from a class, but it is in fact possible! It would be better
 * to use an ArrayList for something like this...more on this
 * idea later...
 */
public class Values {
	public static Values[] all;
	public int num;
	
	public Values () {
		Values[] temp = new Values[all.length + 1];
		for (int i = 0; i < all.length; i++) {
			temp[i] = all[i];
		}
		temp[all.length] = this;
		all = temp;
	}
}
