package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	// Classe auxiliar responsav�l por instanciar as Daos
	// Tem opera��es estaticas para instanciar os Daos
	
	// Macete para n�o expor a implementa��o e deixar somente a interface 
	// Podem assim acrecentar uma instancia��o de SellerDao no programa principal
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	

}
