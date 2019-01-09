package com.zdy.vo;

import java.util.List;
import java.util.Map;

public class ParamVo {
	private List<String> list;
	private Map<String,String> map;
	public ParamVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public ParamVo(List<String> list, Map<String, String> map) {
		super();
		this.list = list;
		this.map = map;
	}
	@Override
	public String toString() {
		return "ParamVo [list=" + list + ", map=" + map + "]";
	}
	
}
