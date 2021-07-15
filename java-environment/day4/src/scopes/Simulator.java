package scopes;

public class Simulator {
	public static void main(String[] args) {
		User one = new User();
		User two = new User();
		Authenticator.login(one);
		Authenticator.login(two);
	}
}
