package DAO;

import java.util.Collection;

import DTO.CustomerDTO;

public interface CustomerDAO {
	public CustomerDTO findById(int id);
	public CustomerDTO findByName(String name);
	public Collection< CustomerDTO> findAll();
	public int DeleteById(int id);
	public int DeleteByName(String Name);
	public int updateCustomer(CustomerDTO customer);
	
}
