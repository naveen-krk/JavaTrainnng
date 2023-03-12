package DAO;

import java.util.Collection;

import DTO.ItemDTO;

public interface ItemDAO {
	public ItemDTO findById(int number);
	public ItemDTO findByName(String name);
	public Collection<ItemDTO> findAll();
	public int deletByName(String name);
	public int  updateItem(ItemDTO item);
	public int deleteById(int number);
}
