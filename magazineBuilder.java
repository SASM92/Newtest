package LibraryTask;

public class magazineBuilder {
	
	int issueNo = 0;
	String name = "fruitcon 2016";
	boolean onLoan = false;
	
	public magazineBuilder(){
		
	}
	
	public Magazine buildMagazine(){
		
		return new Magazine(issueNo, name, onLoan);
		
	}
	
	public magazineBuilder issueNo (int issueNo){
		
		this.issueNo=issueNo;
		return this;
		
	}
	
	public magazineBuilder name (String name){
		
		this.name=name;
		return this;
		
	}
	public magazineBuilder onLoan (boolean onLoan){
		
		this.onLoan=onLoan;
		return this;
		
	}
}
