package generics;

public class CreditCard{
	private String name;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public CreditCard(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public String process(){
		return "Not Accepted";
	}
	
	
public String toString(){
		
		return "Draft Processed";
		
	}
}
