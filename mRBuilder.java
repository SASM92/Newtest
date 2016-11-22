package LibraryTask;

public class mRBuilder {

	String type = "Sega Dreamcast";
	String name = "SSEEGERRR DREAMCEARST";
	boolean onLoan = false;
	
	public mRBuilder(){
		
	}
	
	public mediaResource buildMR(){
		
		return new mediaResource (type, name, onLoan);
		
	}
	
	public mRBuilder type (String type){
		
		this.type=type;
		return this;
		
	}
	
	public mRBuilder name (String name){
		
		this.name=name;
		return this;
		
	}
	public mRBuilder onLoan (boolean onLoan){
		
		this.onLoan=onLoan;
		return this;
		
	}
	
}
