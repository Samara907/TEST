package test.struts.action;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SelectAction {

	private  List list = null;
	
	public String execute() throws IOException {
		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
		try {
			 list = sqlMapper.queryForList("testAll");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("execute");
		return "success";
	}
	
	public List getList() {
		System.out.println("getList");
		System.out.println(list.get(0).getClass());
		return list;
	}
}
