package classes;

public class Stock {
	private int ID;
	private String name;
	private int measurement;
	private String type;
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
	public int getMeasurement() {
		return measurement;
	}
	public void setMeasurement(int measurement) {
		this.measurement = measurement;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Stock(int iD, String name, int measurement, String type) {
		super();
		ID = iD;
		this.name = name;
		this.measurement = measurement;
		this.type = type;
	}
	
	
}
