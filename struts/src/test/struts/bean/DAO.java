package test.struts.bean;

public class DAO {
	
	private static DAO dao = new DAO();
	private DAO() {
		
	}
	
	public static DAO getInstance() {
		return dao;
	}
}
