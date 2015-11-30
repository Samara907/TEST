package test.spring.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean {
	
	@RequestMapping("/test.do")
	//@RequestMapping(value="/test.do",method=RequestMethod.POST)
	public String test(DTO dto) {
		// http://localhost:8000/spring/test.do?msg=javajava
		System.out.println(dto.getMsg());
		return "/1130/test.jsp";
	}
}
