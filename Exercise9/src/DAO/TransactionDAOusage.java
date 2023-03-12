package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.InvoiceDTO;
import DTO.TransactionDTO;
import Table.DatabaseConnection;

public class TransactionDAOusage implements TransactionDAO {

	@Override
	public TransactionDTO findByInvoice(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from  invoice_trans where invoice_no=? ;");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				TransactionDTO transaction = new TransactionDTO();
				transaction.setInvoiceNumber(rs.getInt("invoice_no"));
				transaction.setItemNumber(rs.getInt("itemno"));
				transaction.setItemQuantity(rs.getInt("itemqty"));
				return transaction;
			}
			
			
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		
		return null;
	}
	public int updateTransaction(TransactionDTO transaction) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			int invoiceNumber= transaction.getInvoiceNumber();
			int itemNumber = transaction.getItemNumber();
			PreparedStatement statement =connection.prepareStatement("select * from  invoice_trans where invoice_no = ? and itemno = ?;");		
			statement.setInt(1, invoiceNumber);
			statement.setInt(2, itemNumber);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				statement = connection.prepareStatement("update invoice_trans set  itemqty = ?  where invoice_no=? and itemno = ?");
				statement.setInt(1, transaction.getItemQuantity());
				statement.setInt(2, transaction.getInvoiceNumber());
				statement.setInt(3, transaction.getItemNumber());
				
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
	public int deleteTransaction(int invoiceId) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from  invoice_trans where invoice_no=?;");
			ps.setInt(1, invoiceId);
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
