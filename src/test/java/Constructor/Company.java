package Constructor;


public class Company {
	
	String name;
	int empCount;
	String logo;
	String HQ;
	String ceoName;
	
	public Company(String name, int empCount, String logo, String hQ, String ceoName) {
		this.name = name;
		this.empCount = empCount;
		this.logo = logo;
		this.HQ = hQ;
		this.ceoName = ceoName;
	}

	public Company(String name, int empCount, String ceoName) {
		this.name = name;
		this.empCount = empCount;
		this.ceoName = ceoName;
	}

	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	
	
	public String getCompName() {
		return name;
	}
	
	public String getCompInfo() {
		return "some comp info";
	}
	
}