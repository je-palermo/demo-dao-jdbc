package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); // Consultar no BD o objeto com o id passado por parametro
	List<Seller> findAll ();
	List<Seller> findByDepertment (Department department);
	

}
