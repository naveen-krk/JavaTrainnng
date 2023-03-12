package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.InvoiceDTO;
import DTO.ItemDTO;
import Table.DatabaseConnection;

public class InvoiceDAOusage implements InvoiceDAO{
	public InvoiceDTO findById(int id) {
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where invoicenumber =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerid"));
				return invoice;
			}		
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}
	public InvoiceDTO findByCustomer(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where customerid =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setCustomerId(id);
				invoice.setDate(rs.getString("date"));
				invoice.setInvoiceId(rs.getInt("invoicenumber"));
				
				return invoice;
			}			
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	public Collection<InvoiceDTO> findAll() {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master ;");
			ResultSet rs = statement.executeQuery();
			List<InvoiceDTO> invoices = new ArrayList<>();
			while(rs.next()) {
				InvoiceDTO invoice = new InvoiceDTO();
				invoice.setInvoiceId(rs.getInt("invoicenumber"));
				invoice.setDate(rs.getString("date"));
				invoice.setCustomerId(rs.getInt("customerid"));
				invoices.add(invoice);	
			}
			return invoices;
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	public int updateInvoice(InvoiceDTO invoice) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			//to get customer id
			int id= invoice.getInvoiceId();
			PreparedStatement statement =connection.prepareStatement("select * from invoice_master where invoicenumber = ?;");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				statement = connection.prepareStatement("update invoice_master set  date = ? , customerid = ? where invoicenumber =? ");
				statement.setString(1, invoice.getDate());
				statement.setInt(2, invoice.getCustomerId());
				statement.setInt(3, invoice.getInvoiceId());
				 int n = statement.executeUpdate();
				 DatabaseConnection.closeConnection(null);
				 return n;
			}
			return 0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return 0;
	}
	public int deleteInvoice(int id) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from invoice_master where invoicenumber=?;");
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}
}
