package test.struts.action;

import test.struts.bean.DAO;

public class HelloAction {
	
	private DAO dao = null;
	public String execute() {
		System.out.println("execute");
		return "success";
	}
	
	public void setDAO(DAO dao) {
		this.dao = dao;
	}
}
