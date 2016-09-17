package col;

public class Product implements Comparable<Product>{
	private double rateOfBunch;
	private String label;
	private double count;
	private double countFaultyItems;
	public Product(double rateOfBunch, String label, double count, double countFaultyItems) {
		super();
		this.rateOfBunch = rateOfBunch;
		this.label = label;
		this.count = count;
		this.countFaultyItems = countFaultyItems;
	}
	public double getCountFaultyItems() {
		return countFaultyItems;
	}
	public void setCountFaultyItems(double countFaultyItems) {
		this.countFaultyItems = countFaultyItems;
	}
	public double getRateOfBunch() {
		return rateOfBunch;
	}
	public void setRateOfBunch(double rateOfBunch) {
		this.rateOfBunch = rateOfBunch;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count = count;
	}
	
	public double getAvgDamaged(){
		return this.getCountFaultyItems()/this.count;
	}

@Override
public int compareTo(Product pro) {
	if (this.getAvgDamaged() == pro.getAvgDamaged())
		return Double.valueOf(this.getCount()).compareTo(pro.getCount()); 
	else if (this.getAvgDamaged() > pro.getAvgDamaged())
		return 1;
	else return -1;
}

public boolean equals(Product other) {
	  return (this.getAvgDamaged() == other.getAvgDamaged());
	}
	
}
