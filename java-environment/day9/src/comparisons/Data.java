package comparisons;

public class Data implements Comparable<Data> {
	private int num;
	private double weight;
	
	@Override
	public int compareTo(Data o) {
		if (this.num < o.getNum()) {
			return 1;
		} else if (this.num > o.getNum()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public Data(int num, double weight) {
		this.num = num;
		this.weight = weight;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Data [num=" + num + ", weight=" + weight + "]";
	}	
}
