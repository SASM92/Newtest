package LibraryTask;

public class Book extends Item {

	int ISBN;
	String author;
	
	public Book(int ISBN, String author, String name, boolean onLoan){
		super(name,onLoan);
		this.ISBN=ISBN;
		this.author=author;
	}
	
	//setters
	public void setISBN(int sISBN){
		ISBN =sISBN;
	}
	
	public void setAuthor(String sAuthor){
		author =sAuthor;
	}

	//getters
	public int getISBN(){
		return ISBN;
	}
	
	public String getAuthor(){
		return author;
	}
	
	 public void values() {
			System.out.println("ISBN: "+ISBN+", Author: "+author+", Title: "+name+", on loan? "+onLoan);
		}
}