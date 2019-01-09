package com.zdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zdy.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/test")
	public String test1(Model model){
		model.addAttribute("msg", "模型数据！！！！");
		
		return "success";
	}
	@GetMapping("/test2")
	public String test2(@RequestParam("username")String name,Model model){
		
		model.addAttribute("msg", "我的名字是"+name);
		return "success";
	}
	/**
	 *测试消息转换器
	 * @return
	 */
	@RequestMapping("/test3")
	public String test3(UserVo user){
		System.out.println(user.toString());
		
		return "success";
	}
	@RequestMapping("/test4")
	public String test4(@RequestParam("user")UserVo user){
		System.out.println(user.toString());
		
		return "success";
	}
}
