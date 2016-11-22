package LibraryTask;

public class mediaResource extends Item {

	String type;
	
	public mediaResource(String type, String name, boolean onLoan){
		super(name,onLoan);
		this.type=type;
	}
	
	//setters
	public void setType(String type1){
		type =type1;
	}
	
	//getters
	public String getType(){
		return type;
	}
	
	 public void values() {
			System.out.println("Type: "+type+", Name: "+name+", on loan? "+onLoan);
		}

}
