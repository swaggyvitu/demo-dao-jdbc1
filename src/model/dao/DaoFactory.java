package model.dao;

import model.dao.impl.SellerDaJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaJDBC();
	}
	
}