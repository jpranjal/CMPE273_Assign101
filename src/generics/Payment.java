package generics;
import java.util.Collection;

/*
 * This class processes the payment. We have implemented the code such that, only Cheque, Draft and Debit cards are accepted. 
 * If anyone tries to pay with Credit Card, he will recieve an error notification.
 */
public class Payment<T>{
	public <E> String process(final Collection<E> collection)
	  {
		String response = "Processed";
	    for (final E object : collection)
	    {
	    	try{
	    	((PaymentMode) object).process();
	    	System.out.println("Valid mode of payment");
	    	}
	    	catch(Exception e){
	    		System.out.println("Invalid mode of payment");
	    		response = "Error";
	    	}
	    }
	    return response;
	  }
}






