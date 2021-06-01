package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); // Consultar no BD o objeto com o id passado por parametro
	List<Department> findAll ();
}
