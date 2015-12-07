package test.spring.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView{

	@Override
	protected void renderMergedOutputModel(Map<String, Object> arg0, HttpServletRequest arg1, HttpServletResponse arg2)
			throws Exception {
		File file = (File)arg0.get("downloadFile");
		arg2.setCharacterEncoding(getContentType());
		arg2.setContentLength((int)file.length());
		
		String fileName=  java.net.URLEncoder.encode(file.getName(), "UTF-8");
		arg2.setHeader("Content-Disposition", "attachment;filename=\"" +fileName+ "\";");
		arg2.setHeader("Content=Transfer-Encoding", "binary");
		
		OutputStream out = arg2.getOutputStream();
		FileInputStream fis = null;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try{
					fis.close();
				}
				catch (Exception ee) {
					
				}
			}
			out.flush();
		}
	}
}
