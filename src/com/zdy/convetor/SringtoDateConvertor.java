package com.zdy.convetor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 字符串转为时间类型
 * @author Administrator
 *
 */
//实现convertor接口
public class SringtoDateConvertor implements Converter<String, Date>{

	@Override
	public Date convert(String str) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date= null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return date;
	}
	



}
