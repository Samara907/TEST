package test.struts.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class HelloAction {
	
	private File upload;
	private String contentType;
	private String fileName;
	
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public void setUploadContentType(String contentType) {
		this.contentType = contentType;
	}
	public void setUploadFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String execute() throws IOException {
		File copyFile = new File("E://save//" + fileName);
		FileUtils.copyFile(upload, copyFile);
		System.out.println(contentType);
		System.out.println(upload);
		System.out.println(fileName);
		return "success";
	}
}
