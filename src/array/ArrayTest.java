package array;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {

@Test
public void testBestDealsSort(){
	LaptopSale sale = new LaptopSale();
	
	Laptop bestDeal = new Laptop(900, "Lenovo", "i7", "Windows 8", 16);
	
	sale.addLaptop(new Laptop(1800, "Apple", "Intel Xeon E5 quad core", "macOS", 12));
	sale.addLaptop(bestDeal);
	sale.addLaptop(new Laptop(1300, "DELL", "i7", "window 10", 16));
	
	assertEquals(sale.getbestDeal(),bestDeal);
}


	
}
