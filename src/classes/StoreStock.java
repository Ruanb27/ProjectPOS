package classes;

public class StoreStock {
	private int ID;
	private String description;
	private int quantity;
	private int reOrderLevel;
	private String image;
	private int purchasePrise;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getReOrderLevel() {
		return reOrderLevel;
	}
	public void setReOrderLevel(int reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPurchasePrise() {
		return purchasePrise;
	}
	public void setPurchasePrise(int purchasePrise) {
		this.purchasePrise = purchasePrise;
	}
	public StoreStock(int iD, String description, int quantity, int reOrderLevel, String image, int purchasePrise) {
		super();
		ID = iD;
		this.description = description;
		this.quantity = quantity;
		this.reOrderLevel = reOrderLevel;
		this.image = image;
		this.purchasePrise = purchasePrise;
	}
	
}
