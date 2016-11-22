package LibraryTask;

public class Magazine extends Item {

	int issueNo;
	
	public Magazine(int issueNo, String name, boolean onLoan){
		super(name,onLoan);
		this.issueNo=issueNo;
	}
	
	//setters
	public void setIssue(int sIssue){
		issueNo =sIssue;
	}
	
	//getters
	public int getIssue(){
		return issueNo;
	}
	
	 public void values() {
			System.out.println("Name: "+name+", Issue#"+issueNo+ ", on loan? "+onLoan);
		}
}
