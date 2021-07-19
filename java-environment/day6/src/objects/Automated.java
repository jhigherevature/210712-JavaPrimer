package objects;

public class Automated {
	public String name;
	public int age;
	public Automated(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * The following methods were automatically generated
	 * by the source menu in Spring Tools Suite. The '@Override'
	 * annotation seen below is just an informational tool
	 * that can help you organize your code.
	 * 
	 * Annotations act as a meta-data tag (meta-data = information
	 * about the data/entity) which can provide some functionality
	 * or in some cases limit functionality based on the
	 * annotation itself. Usually, annotations just communicate
	 * an idea
	 */
	@Override
	public String toString() {
		return "Automated [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automated other = (Automated) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
