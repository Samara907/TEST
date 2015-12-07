package test.spring.bean;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBean {
	
	@RequestMapping("/test.do")
	//@RequestMapping(value="/test.do",method=RequestMethod.POST)
	public String test(HttpServletRequest request, HttpSession session) {
		request.setAttribute("msg", "javajavajava");
		System.out.println("hello adviece");
		return "/1130/test.jsp";
	}
	
	/**
	 * @return
	 * @throws Exception
	 * new ModelAndView(bean name, parameter name, down file)
	 */
	@RequestMapping("/download.do")
	public ModelAndView down() throws Exception {
		File down = new File("e://save//temp.jpg");
		ModelAndView mv = new ModelAndView("download", "downloadFile", down);
		return mv;
	}
}
