package application;

import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
		
		
	}

}
