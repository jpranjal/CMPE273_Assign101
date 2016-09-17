package stack;
import java.util.Stack;

public class BookStack {
	public Stack<Book> books = new Stack<Book>();	
	public void initialize(){
		books.push(new Book("Java", 500, 2000));
		books.push(new Book("C", 500, 1500));
		books.push(new Book("Cloud", 800, 800));
		books.push(new Book("Perl", 1800, 1600));
		books.push(new Book("Ruby", 1300, 900));
		books.push(new Book("Windows", 1400, 1000));
		books.push(new Book("Linux", 400, 300));
	}

	public void clearStack(){
		books.removeAllElements();
	}
	
	public  boolean willItFall(int item){
		//lets assume that if any pulled out book has more than 3000Lbs above it, it will fall;
		int weight = 0;
		for(int i = books.size()-1 ; i >item ; i--){
			weight = weight + books.elementAt(i).getWeightLbs();
		}
		System.out.println("Total Wieght above this book is: " +weight);
		if(weight >3000)
			return true;
		else return false;
	}

	public boolean removeBook(int item){
		if(item < books.size() && !willItFall(item)){
			books.remove(item);
			System.out.println("The stack will not fall");
			return true;
		}
		else{
			System.out.println("The stack will fall");
			return false;
		}
	}
	
}
