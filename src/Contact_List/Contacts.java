package Contact_List;

public class Contacts{
	private String Name;
	private String NID;
	private String PHN;
	private String OP;
	
	public Contacts(String Name, String NID, String PHN, String OP) {
		this.Name = Name;
		this.NID = NID;
		this.PHN = PHN;
		this.OP = OP;
	}

	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String NID) {
		this.NID = NID;
	}
	public String getPHN() {
		return PHN;
	}
	public void setPHN(String PHN) {
		this.PHN = PHN;
	}
	
	public String getOP() {
		return OP;
	}

	public void setOP(String OP) {
		this.OP = OP;
	}
	
	

	
}
