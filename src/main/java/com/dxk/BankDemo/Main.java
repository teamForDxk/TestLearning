package com.dxk.BankDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("930508",1000);
		new DrawMoneyThread("dxk", account, 800).start();;
		new DrawMoneyThread("lzw", account, 800).start();;
	}

}
