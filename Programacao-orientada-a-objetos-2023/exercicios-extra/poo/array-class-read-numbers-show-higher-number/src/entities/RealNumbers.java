package entities;

public class RealNumbers implements Comparable<RealNumbers>{

	private double number;
	
	public RealNumbers() {
		
	}

	public RealNumbers(double number) {
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	public int compareTo(RealNumbers o) {
		return (int) (this.number - o.number);
	}

	@Override
	public String toString() {
		return "[number = " + number + "]";
	}	
}
