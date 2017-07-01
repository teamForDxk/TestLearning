package com.dxk.abstractClass;

public class Employee extends Parent{
	Employee(String id,String name,String pay){
		super(id, name, pay);
	}
	public void work(){
		System.out.println("employee work");
	}

}
