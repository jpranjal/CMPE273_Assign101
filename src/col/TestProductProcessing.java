package col;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestProductProcessing {

	//@Test
	public void TestGoodBatchQuality(){
		
		ProcessProducts process = new ProcessProducts();
		Product p1 = new Product(1000, "Bread", 300,0);
		Product p2 = new Product(4000, "Pasta", 400,1);
		Product p3 = new Product(1500, "Muffins", 500,7);
		Product p4 = new Product(1800, "Ice Cream", 400,0);
		Product p5 = new Product(1000, "Soda", 440,10);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		assertEquals(process.getBatchQuality(products),"Good Condition Batch");
	}
	
	
	//@Test
	public void TestFaultyBatchQuality(){
		
		ProcessProducts process = new ProcessProducts();
		Product p1 = new Product(1000, "Bread", 300,30);
		Product p2 = new Product(4000, "Pasta", 400,40);
		Product p3 = new Product(1500, "Muffins", 500,75);
		Product p4 = new Product(1800, "Ice Cream", 400,90);
		Product p5 = new Product(1000, "Soda", 440,0);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		assertEquals(process.getBatchQuality(products),"Faulty Batch");
	}
	
	@Test
	public void TestGetMostDamagedProduct(){
		ProcessProducts process = new ProcessProducts();
		Product p1 = new Product(1000, "Bread", 300,30);
		Product p2 = new Product(4000, "Pasta", 400,40);
		Product p3 = new Product(1500, "Muffins", 500,75);
		Product p4 = new Product(1800, "Ice Cream", 400,90);
		Product p5 = new Product(1000, "Soda", 440,0);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		assertEquals(process.getMostDamagedProduct(products),p4);
	}
	
}
