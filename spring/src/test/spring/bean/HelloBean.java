package test.spring.bean;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean {
	
	@RequestMapping("/test.do")
	//@RequestMapping(value="/test.do",method=RequestMethod.POST)
	public String test(HttpServletRequest request) {
		request.setAttribute("msg", "javajavajava");
		return "/1130/test.jsp";
	}
}
