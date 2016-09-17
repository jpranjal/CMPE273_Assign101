package col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProcessProducts {
	public static void main(String[] args) {
	
		Product p1 = new Product(1000, "Bread", 300,0);
		Product p2 = new Product(1800, "Milk", 500,1);
		Product p3 = new Product(3000, "Butter", 60,6);
		Product p4 = new Product(2000, "Onions", 1800,0);
		Product p5 = new Product(1900, "Potatoes", 800,0);
		Product p6 = new Product(4000, "Pasta", 400,10);
		Product p7 = new Product(1500, "Muffins", 500,15);
		Product p8 = new Product(1800, "Ice Cream", 400,30);
		Product p9 = new Product(1000, "Soda", 440,0);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
	}

	String getBatchQuality(List<Product> products) {
		Map<Product, Double> faults = getFaultyMap(products);
		
		Set<Entry<Product, Double>> set = faults.entrySet();
        List<Entry<Product, Double>> list = new ArrayList<Entry<Product, Double>>(set);
        
        double avgFault = 0;
        for(Entry<Product, Double> e : list){
        	avgFault += e.getKey().getAvgDamaged();
        }
        
        if(avgFault > 0.1){
        	System.out.println("Faulty Batch");
        	return "Faulty Batch";
        }
        else{
        	System.out.println("Good Condition Batch");
        	return "Good Condition Batch";
        }
	}

	public Product getMostDamagedProduct(List<Product> products) {
		Map<Product, Double> faults = getFaultyMap(products);
	
		Set<Entry<Product, Double>> set = faults.entrySet();
        List<Entry<Product, Double>> list = new ArrayList<Entry<Product, Double>>(set);
  
        Collections.sort( list, new Comparator<Map.Entry<Product, Double>>()
        {
            public int compare( Map.Entry<Product, Double> o1, Map.Entry<Product, Double> o2 )
            {
                return (-(o1.getValue()).compareTo( o2.getValue()));
            }
        } );
        
        Map.Entry<Product, Double> mostDamagedMap = list.get(0);
        System.out.println("Most damaged product is: " + mostDamagedMap.getKey().getLabel());
        return mostDamagedMap.getKey();
	}

	private static Map<Product, Double> getFaultyMap(List<Product> products) {
		Map<Product, Double> faults = new HashMap<Product, Double>() ;
	
		for(Product p : products){
			if (p.getCountFaultyItems() >0){
				faults.put(p, p.getAvgDamaged());
			}
		}
		return faults;
	}
	
	
	
	
	
}
