package classes;

public class Sales {
	private int ID;
	private int totalPrice;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Sales(int iD, int totalPrice) {
		super();
		ID = iD;
		this.totalPrice = totalPrice;
	}
	
	
}
