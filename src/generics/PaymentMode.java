package generics;

public class PaymentMode{
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
	public PaymentMode(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	
	public String process(){
		return this.process();
	}
	
	
public String toString(){
		
		return "Cheque Processed";
		
	}
	
}