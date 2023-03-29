package model.dao;


public class DaoFactory{
public static SellerDao createSellerDao() {
	return SellerDaoJDBC();
}

private static SellerDao SellerDaoJDBC() {
	// TODO Auto-generated method stub
	return null;
}
	}

