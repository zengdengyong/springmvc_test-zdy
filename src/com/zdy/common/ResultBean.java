package com.zdy.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResultBean {
	private boolean success;
	private String message;
	private Object data;

	
	public ResultBean(boolean success) {
		super();
		this.success = success;
	}
	
	
	/**
	 * 请求成功，没有异常信息
	 */
	public static ResultBean success(){
		return new ResultBean(true);
	}
	
	/**
	 * 请求成功，有数据返回
	 */
	public static ResultBean success(Object data){
		ResultBean resultBean = new ResultBean(true);
		resultBean.setData(data);
		return  resultBean;
	}

	
	
}
