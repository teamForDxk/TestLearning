package com.dxk.Thread;

import java.util.Iterator;

/**
 * 
 * <p>Title: ThreadForImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	DXK
 * @date	2017年7月1日下午3:37:03
 * @version 1.0
 */
public class ThreadForExtends extends Thread {
	private String name;
	private int count;
	ThreadForExtends(String name,int count){
		this.name = name;
		this.count = count;
	}
	public void run(){
		for(int i=1; i<6; i++){
			System.out.println(name + "线程运行 --- "+ i + "count =" + count--);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadForExtends t1 = new ThreadForExtends("丁杏凯",10);
		ThreadForExtends t2 = new ThreadForExtends("李召伟",10);
		ThreadForExtends t3 = new ThreadForExtends("尹云肖",10);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
	



	
