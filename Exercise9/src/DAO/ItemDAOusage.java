package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import DTO.ItemDTO;
import Table.DatabaseConnection;


public class ItemDAOusage implements ItemDAO{
	public ItemDTO findById(int number) {
		try {
		Connection connection  = DatabaseConnection.getConnection();
		PreparedStatement statement =connection.prepareStatement("select * from item_master where itemno =?");
		statement.setInt(1, number);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			ItemDTO item = new ItemDTO();
			item.setNumber(number);
			item.setDescription(rs.getString("item_description"));
			item.setPrice(rs.getInt("item_price"));
			item.setUnit(rs.getInt("item_unit"));
			return item;
		}	
	} catch (Exception e) {
		DatabaseConnection.closeConnection(e);
	}
		
		return null;
	}

	
	
	@Override
	public ItemDTO findByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection  = DatabaseConnection.getConnection();
			PreparedStatement statement =connection.prepareStatement("select * from item_master where item_description =?");
			statement.setString(1, name);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				ItemDTO item = new ItemDTO();
				item.setNumber(rs.getInt("itemno"));
				item.setDescription(name);
				item.setPrice(rs.getInt("item_price"));
				item.setUnit(rs.getInt("item_unit"));
				
				return item;
			}	
		} catch (Exception e) {
			DatabaseConnection.closeConnection(e);
		}
		return null;
	}

	public Collection<ItemDTO> findAll() {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				try {
					Connection connection  = DatabaseConnection.getConnection();
					PreparedStatement statement =connection.prepareStatement("select * from item_master ");
					ResultSet rs = statement.executeQuery();
					List<ItemDTO> items = new ArrayList<>();
					while(rs.next()) {
						ItemDTO item = new ItemDTO();
						item.setDescription(rs.getString("item_description"));
						item.setNumber(rs.getInt("itemno"));
						item.setPrice(rs.getInt("item_price"));
						item.setUnit(rs.getInt("item_unit"));
						items.add(item);
					}
					return items;
					
					
				} catch (Exception e) {
					// TODO: handle exception
					DatabaseConnection.closeConnection(e);
				}
				
		
		
		return null;
	}

	@Override
	public int updateItem(ItemDTO item) {
		try {
			Connection connection  = DatabaseConnection.getConnection();
			//To get customer id
			int id= item.getNumber();
			
			PreparedStatement statement =connection.prepareStatement("select * from item_master where itemno= ?;");
		
			statement.setInt(1, id);
			
			ResultSet rs = statement.executeQuery();
			
			
			
			if(rs.next()) {
				statement = connection.prepareStatement("update items set item_description =? , item_price= ? , itemunit = ? where itemno =?;");
				statement.setString(1, item.getDescription());
				statement.setInt(2, item.getPrice());
				statement.setInt(3, item.getPrice());
				statement.setInt(4, item.getNumber());
				
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
	public int deleteById(int number) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from item_master where itemno=?;");
			ps.setInt(1, number);
			int n = ps.executeUpdate();
			DatabaseConnection.closeConnection(null);
			return n;
		}catch(Exception e) {
			e.printStackTrace();
			DatabaseConnection.closeConnection(e);
			return 0;
		}
	}

	@Override
	public int deletByName(String name) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("delete from item_master where item_description=?;");
			ps.setString(1, name);
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
