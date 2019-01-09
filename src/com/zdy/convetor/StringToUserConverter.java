package com.zdy.convetor;

import org.springframework.core.convert.converter.Converter;

import com.zdy.vo.UserVo;

public class StringToUserConverter implements Converter<String, UserVo> {
	//"11-zhangsan-456789@qq.com";
	@Override
	public UserVo convert(String str) {
		// TODO Auto-generated method stub
		String[] userArr = str.split("-");
		UserVo user = new UserVo();
		user.setId(Integer.parseInt(userArr[0]));
		user.setUsername(userArr[1]);
		user.setEmail(userArr[2]);
	
		return user;
	}

}
