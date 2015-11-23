package test.struts.action;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ModelDriven;//get
import com.opensymphony.xwork2.Preparable; //set

import test.struts.bean.TestDTO;

public class TestAction implements Preparable, ModelDriven{
	
	
	private TestDTO dto = null;
	
	public String form() {
		return "success";
	}
	
	public String execute() throws IOException, SQLException {
		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
		sqlMapper.insert("testInsert",dto);
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
