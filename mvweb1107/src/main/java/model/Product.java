package model;

public class Product {

	private String code;
	private String price;
	private int Quantity;
	private String description;
	public Product() {
	}
	public Product(String code, String price, int Quantity, String description) {
		this.code = code;
		this.price = price;
		this.Quantity = Quantity;
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quanatity) {
		this.Quantity = quanatity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
