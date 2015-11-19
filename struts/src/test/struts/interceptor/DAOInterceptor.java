package test.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.bean.DAO;
import test.struts.face.DAOFace;

public class DAOInterceptor implements Interceptor{

	private DAO dao = null;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		dao = dao.getInstance();
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Object obj = arg0.getAction();
		if (obj instanceof DAOFace) {
			DAOFace df = (DAOFace)obj;
			df.setDAO(dao);
		}
		return arg0.invoke();
	}
}
