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
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller sel = sellerDao.findById(3);
		
		System.out.println(sel);
		
		
	}

}
