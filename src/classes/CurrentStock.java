package classes;

public class CurrentStock {
	private int ID;
	private int quantity;
	private int sellingPrice;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public CurrentStock(int iD, int quantity, int sellingPrice) {
		super();
		ID = iD;
		this.quantity = quantity;
		this.sellingPrice = sellingPrice;
	}
	
	
}
