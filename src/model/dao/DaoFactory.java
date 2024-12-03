package model.dao;

import db.DB;
import model.dao.impl.SellerDaJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaJDBC(DB.getConnection());
	}
	
}
