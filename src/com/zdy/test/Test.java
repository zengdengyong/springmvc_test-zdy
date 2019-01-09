package com.zdy.test;

import org.springframework.stereotype.Controller;
/**
 * 测试自定义注解
 * @author Administrator
 *
 */
@TestaAnnotation
@Controller
public class Test {
	@TestaAnnotation
	public String test(){
		
		return "success";
	}
}
