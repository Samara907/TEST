package test.spring.bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloBean {
	
	@RequestMapping("/test.do")
	public String test() {
		return "/1130/test.jsp";
	}
}
