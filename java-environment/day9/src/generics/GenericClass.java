package generics;

public class GenericClass<Placeholder> {
	private Placeholder data;
	
	public GenericClass(Placeholder data) {
		this.data = data;
	}
	
	public Placeholder getData() {
		return data;
	}
	
	public void setData(Placeholder data) {
		this.data = data;
	}
}
