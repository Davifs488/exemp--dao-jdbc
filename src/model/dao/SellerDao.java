package model.dao;

import java.util.List;



public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller finById(Integer id);
	List<Seller>findAll();
}
