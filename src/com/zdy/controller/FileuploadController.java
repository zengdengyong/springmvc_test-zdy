package com.zdy.controller;
/**
 * 文件上传
 * @author Administrator
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileuploadController {

	@RequestMapping("/upload")
	public String upload(
			@RequestParam("uploadFile")MultipartFile uploadFile,
			HttpServletRequest request) throws IOException {
		/**
		 * 1.重命名上传文件
		 * 		保留原来的扩展名
		 * 		通过UUID构建新的文件名
		 * 2.确定文件上传路径
		 * 3.创建文件目录
		 * 4.创建文件本身
		 * 5.调用Multipart的transferTo方法进行上传

		 */
		
		String originalFilename = uploadFile.getOriginalFilename();
		
		//test.jpg
		String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
		
		//通过UUID生成一个新的文件名
		String fileName = UUID.randomUUID().toString() + extension;
		
		//确定上传目录, web
		String path = request.getServletContext().getRealPath("/image");
		//映射一个文件对象
		File file = new File(path, fileName);
		
		//判读父目录是否存在
		File parentFile = file.getParentFile();
		
		if(!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//创建文件本身, 在磁盘上创建文件(0kb)
		file.createNewFile();
		
		//向文件写入数据
		uploadFile.transferTo(file);
		

		return "success";
	}
}