package test.spring.bean;

import java.io.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBean {
	
	@RequestMapping("/test.do")
	//@RequestMapping(value="/test.do",method=RequestMethod.POST)
	public String test(MultipartHttpServletRequest request) throws Exception {
		MultipartFile file = request.getFile("upload");
		String name = file.getOriginalFilename();
		File sf = new File("e://save//" + name);
		file.transferTo(sf);
		return "/test/fileupload.jsp";
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
