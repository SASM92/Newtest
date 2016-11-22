package LibraryTask;

public class bookBuilder {

	int ISBN = 0;
	String author = "donkey kong";
	String name = "bananarama 2016";
	boolean onLoan = false;
	
	public bookBuilder(){
		
	}
	
	public Book buildBook(){
		
		return new Book(ISBN, author, name, onLoan);
		
	}
	
	public bookBuilder ISBN (int ISBN){
		
		this.ISBN=ISBN;
		return this;
		
	}
	
	public bookBuilder author (String author){
		
		this.author=author;
		return this;
		
	}
	
	public bookBuilder name (String name){
		
		this.name=name;
		return this;
		
	}
	public bookBuilder onLoan (boolean onLoan){
		
		this.onLoan=onLoan;
		return this;
		
	}
	
	
}
