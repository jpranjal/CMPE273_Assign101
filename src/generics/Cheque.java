package generics;

public class Cheque extends PaymentMode{
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
	public Cheque(String name, double amount) {
		super(name, amount);
		this.name = name;
		this.amount = amount;
	}
	
	public String process(){
		return "Processed";
	}
	
	
public String toString(){
		
		return "Cheque Processed";
		
	}
	
}