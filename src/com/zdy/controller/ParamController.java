package com.zdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zdy.vo.ParamVo;
import com.zdy.vo.UserVo;

@Controller
@RequestMapping("/param")
public class ParamController {
	@RequestMapping("/test1")
	public String test1(UserVo user){
		System.out.println(user.toString());
		return "success";
	}
	/*
	 * 注意：list和map 的注入需要包装类把他包起来
	 */
	//list注入
	@RequestMapping("/test2")
	public String test2(ParamVo p){
		System.out.println(p.toString());
		return "success";
	}
	//map注入
	@RequestMapping("/test3")
	public String test3(ParamVo p){
		
		System.out.println(p.toString());
		return "success";
	}
	
}
