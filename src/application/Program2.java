package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("===== TESTE 1: FindByDepartment ======");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);
	
		System.out.println("");
		System.out.println("===== TESTE 2: Insert ======");
		department = new Department(null, "TI");
		departmentDao.insert(department);
		
		System.out.println("Departamento cadastrdo com sucesso");
		System.out.println("Id: " + department.getId());
		
		
		System.out.println("");
		System.out.println("===== TESTE 3: update ======");
		
		department = departmentDao.findById(6);
		department.setName("Teste");
		
		System.out.println("");
		System.out.println("===== TESTE 4: FindAllDepartment ======");
		
		List<Department> list = departmentDao.findAll();	
		
		for (Department depList: list) {
			System.out.println(depList);
		}
		
		System.out.println("");
		System.out.println("===== TESTE 5: Delete ======");
		departmentDao.deleteById(10);
		
	}

}
