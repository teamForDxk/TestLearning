package com.dxk.abstractClass;

public abstract class Parent {
	private String id;
	private String name;
	private String pay;
	
	Parent(String id,String name,String pay){
		this.id = id;
		this.name = name;
		this.pay = pay;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pay=" + pay + "]";
	}
	

}
