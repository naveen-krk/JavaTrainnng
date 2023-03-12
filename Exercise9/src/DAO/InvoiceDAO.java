package DAO;

import java.util.Collection;

import DTO.InvoiceDTO;

public interface InvoiceDAO {
	public InvoiceDTO findById(int id);
	public InvoiceDTO findByCustomer(int id);
	public Collection<InvoiceDTO> findAll();
	public int deleteInvoice(int id);
	public int updateInvoice(InvoiceDTO invoice);
}
