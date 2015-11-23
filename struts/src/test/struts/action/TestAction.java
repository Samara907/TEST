package test.struts.action;

import com.opensymphony.xwork2.ModelDriven;//get
import com.opensymphony.xwork2.Preparable; //set

import test.struts.bean.TestDTO;

public class TestAction implements Preparable, ModelDriven{
	
	
	private TestDTO dto = null;
	
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

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		dto = new TestDTO();
	}
}
