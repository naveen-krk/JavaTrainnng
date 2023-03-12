package DTO;

import java.io.Serializable;

public class TransactionDTO {
	
	private int invoiceNumber , itemNumber , itemQuantity;
	public TransactionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionDTO(int invoiceNumber, int itemNumber, int itemQuantity) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.itemNumber = itemNumber;
		this.itemQuantity = itemQuantity;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}
