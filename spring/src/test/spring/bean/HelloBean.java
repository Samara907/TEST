package test.spring.bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloBean {
	
	@RequestMapping(value="/test.do",method=RequestMethod.GET)
	public String test() {
		return "/1130/test.jsp";
	}
}
