package LibraryTask;

import java.util.ArrayList;

public class Library {

	
	public void updateBook(){
		
	}
	
	public void addBook(){
		
	}
	
	public void removeBook(){
		
	}
	
	public void registerPerson(int CID, String name){
	
	}
	
	public void deletePerson(){
		
	}
	
	public void updatePerson(){
		
	}
	
	public void itemCheckIn(){
		
	}
	
	public void itemCheckOut(){
		
	}
	

	public static void main(String[] args) {
		
		Book b1 = new bookBuilder().name("Malice in Chunderland").buildBook();
		Book b2 = new bookBuilder().name("Swalden").buildBook();
		Book b3 = new bookBuilder().name("Some sh*t").buildBook();
		
		mediaResource mr1 = new mRBuilder().name("xboner").buildMR();
		mediaResource mr2 = new mRBuilder().name("Soony Camero").buildMR();
		mediaResource mr3 = new mRBuilder().name("Sam'n'Sung VHS recorder").buildMR();
		
		Magazine m1 = new magazineBuilder().name("Lyfe Magazine").buildMagazine();
		Magazine m2 = new magazineBuilder().name("GCHQ").buildMagazine();
		Magazine m3 = new magazineBuilder().name("Thyme Magazine").buildMagazine();

		/*
		b1.values();
		b2.values();
		b3.values();
		m1.values();
		*/
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		ArrayList<Magazine> magazines = new ArrayList<Magazine>();
		magazines.add(m1);
		magazines.add(m2);
		magazines.add(m3);
		
		ArrayList<mediaResource> mr = new ArrayList<mediaResource>();
		mr.add(mr1);
		mr.add(mr2);
		mr.add(mr3);

		ArrayList<Customer> cust = new ArrayList<Customer>();
		
		}
	
}
