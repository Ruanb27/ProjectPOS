package classes;

public class SalesDetails {
	private int salesID;
	private int unitPrice;
	private int quantity;
	public int getSalesID() {
		return salesID;
	}
	public void setSalesID(int salesID) {
		this.salesID = salesID;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public SalesDetails(int salesID, int unitPrice, int quantity) {
		super();
		this.salesID = salesID;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	
}
