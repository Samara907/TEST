package test.struts.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DownAction {
	
	private String fileName;
	private InputStream inputStream;
	
	public String execute() throws FileNotFoundException {
		inputStream = new FileInputStream("e://save//" + fileName);
		return "success";
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
}
