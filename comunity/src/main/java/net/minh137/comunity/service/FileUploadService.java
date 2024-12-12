package net.minh137.comunity.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import net.minh137.comunity.model.FileDto;

@Service
public class FileUploadService implements FileUpload {
	
	private String[] allowedExt;
	private long maxSize;
	
	private String path;
	private String orPath;
	
	private String fileExt;
	private long fileSize;
	
	private FileDto fileDto = new FileDto();
	
	@Autowired
	private ServletContext sc;

	@Override
	public String[] getAllowedExt() {
		return allowedExt;
	}

	@Override
	public void setAllowedExt(String[] allowedExt) {
        this.allowedExt = allowedExt;
	}

	@Override
	public void setMaxSize(long maxSize) {
		//maxSize 媛� 0�씠硫� 湲곕낯媛� 2MB �꽕�젙
        this.maxSize = (maxSize > 0) ? maxSize : 2 * 1024 * 1024;
	}

	@Override
	public long getMaxSize() {
		return maxSize;
	}

	@Override
	public void setAbsolutePath(String path) {
		this.path =sc.getRealPath("/res/upload/") + path + "/";
		this.orPath = path;
		System.out.println(this.path);
		//�뵒�젆�넗由ш� �뾾�쓣 寃쎌슦 �깮�꽦�븳�떎.
		File dir = new File(this.path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
	}

	@Override
	public String getAbsolutePath() {
		return path;
	}

	
	@Override
	public String getFileExt(String filename) {
		if(filename == null || filename.isEmpty()) {
			return "";
		}
		int dotIndex = filename.lastIndexOf(".");
		return (dotIndex != -1 && dotIndex < filename.length() - 1) ? filename.substring(dotIndex + 1) :"";
	}
	
	public FileDto uploadFile(MultipartFile file) throws IOException {
		
		fileExt = getFileExt(file.getOriginalFilename());
		fileSize = file.getSize();
		
		if(file == null || file.isEmpty()) {
			throw new IllegalArgumentException("�꽑�깮�맂 �뙆�씪�씠 �뾾�뒿�땲�떎.");
		}
		

		if(maxSize > 0 && file.getSize() > maxSize) {
			throw new IllegalArgumentException("�뙆�씪�뾽濡쒕뱶 �젣�븳�슜�웾 " + maxSize + "瑜� 珥덇낵�뻽�뒿�땲�떎.");
		}
		
		if(allowedExt != null && allowedExt.length > 0) {
			boolean isFileOk = false;
			for(String ext : allowedExt) {
				if(fileExt.equalsIgnoreCase(ext)) {  //���냼臾몄옄 �긽愿��뾾�씠 鍮꾧탳
					isFileOk = true;
					break;
				}
			}
			
			if(!isFileOk) {
				throw new IllegalArgumentException("�뿀�슜�릺吏� �븡�뒗 �솗�옣�옄." + fileExt);
			}
			
		}
		

		String orFilename = file.getOriginalFilename();
		String newFilename = System.currentTimeMillis() + "-"+ orPath +"." + fileExt;
		File dest = new File(path, newFilename);
		
		fileDto.setNewfilename(newFilename);
		fileDto.setOrfilename(orFilename);
		fileDto.setExt(fileExt);
		fileDto.setFilesize(fileSize);
 
		file.transferTo(dest);
		
		
		return fileDto;
	}

}
