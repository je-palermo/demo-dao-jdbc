package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	// Classe auxiliar responsavél por instanciar as Daos
	// Tem operações estaticas para instanciar os Daos
	
	// Macete para não expor a implementação e deixar somente a interface 
	// Podem assim acrecentar uma instanciação de SellerDao no programa principal
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	

}
