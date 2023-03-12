package DTO;

import java.io.Serializable;

public class InvoiceDTO {
	private int invoiceId , customerId;
	private String date;
	public InvoiceDTO(int invoiceId, int customerId, String date) {
		super();
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.date = date;
	}
	public InvoiceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
