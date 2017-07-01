package com.dxk.abstractClass;

public class Manager extends Parent{
	private String status;
	
	public Manager(String id,String name,String pay,String status) {
		// TODO Auto-generated constructor stub
		super(id, name, pay);
		this.status = status;
	}
	public void work(){
		System.out.println("Manager work");
	}

}
