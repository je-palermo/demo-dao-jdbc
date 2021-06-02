package application;

import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		//Injeção de dependencia 
		// ^		^		^	
		System.out.println("=== Test 1: Seller findById ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);
		
		System.out.println("\n=== Test 2: Seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepertment(dep);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3: Seller findAll ===");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
	}

}
