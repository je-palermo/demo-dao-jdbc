package application;

import java.util.Date;
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
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
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
		
		System.out.println("\n=== Test 4: Seller insert ===");
		
		Seller newSeller = new Seller(null, "Tampa", "tampa.melo@gmail.com", new Date(), 3000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Usuário cadastrado!");
		System.out.println("Id: " + newSeller.getId());
		
		System.out.println("\n=== Test 5: Seller update ===");
		seller = sellerDao.findById(9);
		seller.setName("Baga Trouxa");
		
		sellerDao.update(seller);
		
		System.out.println("Atualizado: " + seller.getName());
		
	}

}
