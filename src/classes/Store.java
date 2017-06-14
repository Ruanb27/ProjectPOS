package classes;

public class Store {
	private int ID;
	private String name;
	private  int parentStoreID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentStoreID() {
		return parentStoreID;
	}
	public void setParentStoreID(int parentStoreID) {
		this.parentStoreID = parentStoreID;
	}
	public Store(int iD, String name, int parentStoreID) {
		super();
		ID = iD;
		this.name = name;
		this.parentStoreID = parentStoreID;
	}


}
