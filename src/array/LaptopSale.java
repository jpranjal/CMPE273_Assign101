package array;

import java.util.Arrays;

public class LaptopSale {

	public Laptop[] lappies = new Laptop[10];
	int pointer = 0;
	public void addLaptop(Laptop lap) {
		
		
		lappies[pointer++] = lap;
		
		Arrays.sort(lappies,0,pointer);
		
	}
	public void displayLaptops(){
		System.out.println("Best Deals --- Top to Buttom sorted");
		for(int i = 0 ; i <pointer ; i++){
			System.out.println(lappies[i].toString());
		}
	}
	
	public Laptop getbestDeal(){
		if(pointer ==0 && null == lappies[0])
			return new Laptop(0, "NULL", "NA", "NA", 0);
		else {
			System.out.println(lappies[0].toString());
			return lappies[0];
		}
	}
}
