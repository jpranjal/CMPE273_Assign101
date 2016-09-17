package stack;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {

//@Test
public void testWillItFall(){
	BookStack bookStack = new BookStack();
	bookStack.initialize();
	
	//lets add more books first
	bookStack.books.push(new Book("Android Development", 1600, 1000));
	bookStack.books.push(new Book("iOS Development", 1200, 800));
	bookStack.books.push(new Book("Distributed systems", 2000, 1500));
	bookStack.books.push(new Book("DBMS", 2300, 1800));
	
	
	//we already know that the weight above 4th book from top is greater than 3000Lbs
	assertEquals(bookStack.willItFall(3), true);
}
	
//@Test
public void removeTopmostBook(){
	BookStack bookStack = new BookStack();
	bookStack.initialize();
	int size = bookStack.books.size();
	assertEquals(bookStack.removeBook(size-1), true);
	
}

@Test
public void testClear(){
	BookStack bookStack = new BookStack();
	bookStack.initialize();
	bookStack.clearStack();
	
	assertEquals(bookStack.books.isEmpty(), true);
	
	
}
	
}
