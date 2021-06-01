package application;

import java.util.Date;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Department obj = new Department(1, "Books");
		
		//Injeção de dependencia 
		// ^		^		^		 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller sel = new Seller(21, "Fudencio", "fudencio.com", new Date(), 3000.0, obj);
		
		System.out.println(sel);
		
		
	}

}
