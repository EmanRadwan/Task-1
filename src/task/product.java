package task;

public class product {
	private int ID;
	private String type;
	private String manufacturer ;
	private String productionDate ;
	private String expiryDate  ;
	
	public product(int ID){
		this.ID = ID;
		//this.type=type;
		//this.manufacturer=manufacturer;
		//this.productionDate=productionDate;
		//this.expiryDate=expiryDate;
		}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID){
		this.ID = ID;
		}
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getType() {
		return type;
		}
	public void setType(String Type) {
		this.type = Type;
	}
}