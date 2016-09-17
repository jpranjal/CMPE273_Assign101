package generics;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestPaymentProcess {

	//@Test
	public void TestSupportedProcess(){
		
		final Payment<?> type = new Payment<Object>();
		final List<Object> list = new ArrayList<Object>();
		list.add(new Cheque("Pranjal", 1000));
		list.add(new Draft("Prateek", 500));
		
		assertEquals(type.process(list),"Processed");
	}
	
	
	@Test
	public void TestInvalidProcess(){
		
		final Payment<?> type = new Payment<Object>();
		final List<Object> list = new ArrayList<Object>();
		list.add(new Cheque("Pranjal", 1000));
		list.add(new Draft("Prateek", 500));
		list.add(new CreditCard("Prateek", 500));
		
		assertEquals(type.process(list),"Processed");
	}
}
