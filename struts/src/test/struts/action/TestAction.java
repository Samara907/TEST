package test.struts.action;

import com.opensymphony.xwork2.ModelDriven;//get
import com.opensymphony.xwork2.Preparable; //set

import test.struts.bean.TestDTO;

public class TestAction implements ModelDriven{
	
	
	private static TestDTO dto = new TestDTO();
	
	public String form() {
		return "success";
	}
	
	public String execute() {
		return "success";
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return dto;
	}

}
