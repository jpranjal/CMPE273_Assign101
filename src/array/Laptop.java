package array;

public class Laptop implements Comparable<Laptop>{

	private int price;
	private String brand;
	private String processor;
	private String os;
	private int ram;
	public Laptop(int price, String brand, String processor, String os, int ram) {
		super();
		this.price = price;
		this.brand = brand;
		this.processor = processor;
		this.os = os;
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public boolean equals(Laptop other) {
		  return (this.getOs() == other.getOs() && this.getPrice() == other.getPrice() && this.getRam() ==other.getRam() && this.getProcessor() == other.getProcessor());
		}
	
	
	public int compareTo(Laptop other) {
		if (this.equals(other))
			return 0;
		else if(this.getPrice() == other.getPrice())
			{
			if(this.getRam() > other.getRam())
			return -1;
			else
			return 1;
			}
		else if(this.getPrice() < other.getPrice())
		{
		return -1;
		}
		else
			return 1;
		
	}
	
	public String toString(){
		
		return getBrand() + " " + getOs() + " " +  getProcessor() + " " + getRam() + " " + getPrice() + "\n";
		
	}
	
}
