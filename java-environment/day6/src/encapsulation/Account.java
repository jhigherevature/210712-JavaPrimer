package encapsulation;

public class Account {
	private String name;
	private String email;
	private String address;
	private long id;
	private double total;
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	private long getId() {
		return this.id;
	}
	
	void setId(long id) {
		this.id = id;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	public double getTotal() {
		return total;
	}

	protected void setTotal(double total) {
		this.total = total;
	}
	
}
