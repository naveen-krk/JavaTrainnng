package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DTO.CustomerDTO;
import Table.DatabaseConnection;
public class CustomerDAOusage implements CustomerDAO{
	public CustomerDTO findById(int id) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customer_id =?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setId(id);
				customer.setName(rs.getNString("customer_name"));
				customer.setAddress(rs.getString("customer_address"));
				return customer;
			}	
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}
	public CustomerDTO findByName(String name) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customer_name =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(name);
				customer.setId(rs.getInt("customer_id"));
				customer.setAddress(rs.getString("customer_address"));
				return customer;
			}	
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}
	public Collection<CustomerDTO> findAll() {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master ");
			ResultSet rs = statement.executeQuery();
			List<CustomerDTO> customers = new ArrayList<>();
			while(rs.next()) {
				CustomerDTO customer = new CustomerDTO();
				customer.setName(rs.getString("customer_name"));
				customer.setId(rs.getInt("customer_id"));
				customer.setAddress(rs.getString("customer_address"));
				 customers.add(customer);
			}
			return customers;
		} catch (Exception e) {
			// TODO: handle exception
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	@Override
	public int updateCustomer(CustomerDTO customer) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			//To get customer id
			int id= customer.getId();
			PreparedStatement statement =connection.prepareStatement("select * from customer_master where customer_id = ?");
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				statement = connection.prepareStatement("update customer_master set customer_name =? , customer_address = ? where customer_id =?;");
				statement.setString(1, customer.getName());
				statement.setString(2, customer.getAddress());
				statement.setInt(3, customer.getId());
				 int n = statement.executeUpdate();
				 DatabaseConnection.closeConnection(null);
				 return n;
			}
			return 0;
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}		
		return 0;
	}
	public int DeleteByName(String Name) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customer_master where customer_name=?");
			statement.setString(1, Name);
			int n = statement.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}
	public int DeleteById(int id) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from customer_master where customer_id=?");
			statement.setInt(1, id);
			int n = statement.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}

	}


