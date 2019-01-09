package com.zdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zdy.vo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	/**
	 * 测试lombok是否生效
	 * @param stu
	 * @return
	 */
	@GetMapping(value="/test1")
	public String test1(Student stu){
		System.out.println(stu.toString());
		
		return "success";
	}
}
