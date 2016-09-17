package stack;

public class Book {

	private String name;
	private int pages;
	private int weightLbs;
	
	public Book(String name, int pages, int weightLbs){
		this.name = name;
		this.pages = pages;
		this.weightLbs = weightLbs;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getWeightLbs() {
		return weightLbs;
	}
	public void setWeightLbs(int weightLbs) {
		this.weightLbs = weightLbs;
	}
	
	
	
}
