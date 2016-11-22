package LibraryTask;

public class Customer {

	int CID;
	String name;
	
	public Customer(int CID, String name){
		this.CID=CID;
		this.name=name;
	}
	
	//setters
	public void CID(int sCID){
		CID =sCID;
	}
	
	public void setName(String sName){
		name =sName;
	}

	//getters
	public int getCID(){
		return CID;
	}
	
	public String getName(){
		return name;
	}
}
