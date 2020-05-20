package com.example.jackson;

import java.util.List;
import java.util.Map;

public class PlainObject {

	private String string;
	private int i;
	private List<String> list;
	private Map<String, String> map;
	private ChildObject co;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
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

	public ChildObject getCo() {
		return co;
	}

	public void setCo(ChildObject co) {
		this.co = co;
	}
}

class ChildObject {
	private String s;
	private int i;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}