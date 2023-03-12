package DTO;

import java.io.Serializable;

public class ItemDTO {

	private int number , price ,unit;
	private String description;
	
	
	public ItemDTO(int number, int price, int unit, String description) {
		super();
		this.number = number;
		this.price = price;
		this.unit = unit;
		this.description = description;
	}
	
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}