package designpatterns;

import java.io.Serializable;

public class JavaBean implements Serializable {
	private String name;
	private int age;
	
	public JavaBean() {
		super();
	}
	/*
	 * Parameterized constructors are not required for Java
	 * Beans, but they are very commonly included.
	 */
	public JavaBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/*
	 * Overridden hashCode(), equals() and toString() methods
	 */
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
		JavaBean other = (JavaBean) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", age=" + age + "]";
	}
	
	/*
	 * Getters and Setters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
