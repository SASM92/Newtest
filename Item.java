package LibraryTask;

public abstract class Item {
 
	String name;
	boolean onLoan;
	
	public Item(String name, boolean onLoan){
		this.name=name;
		this.onLoan=onLoan;

	}
	
	//setters
	public void setName(String sName){
		name =sName;
	}
	
	public void setStatus(boolean setStatus){
		onLoan =setStatus;
	}
	
	//getters
	public String getName(){
		return name;
		
	}
	
	public boolean getStatus(){
		return onLoan;
		
	}
}
