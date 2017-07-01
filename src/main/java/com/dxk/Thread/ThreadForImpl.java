package com.dxk.Thread;

public class ThreadForImpl implements Runnable{
	private int count = 30;
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName()+"运行 count=" + count--);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadForImpl t1  = new ThreadForImpl();
		new Thread(t1,"A").start();
		new Thread(t1,"B").start();
		new Thread(t1,"C").start();
	}

}
