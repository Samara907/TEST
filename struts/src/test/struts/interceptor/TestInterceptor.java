package test.struts.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.face.AddFace;

public class TestInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("인터셉터 실행");
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Object obj = arg0.getAction();
		if (obj instanceof AddFace) {
			AddFace af = (AddFace)obj;
			af.add();
		}
		return arg0.invoke();
	}
	
}
