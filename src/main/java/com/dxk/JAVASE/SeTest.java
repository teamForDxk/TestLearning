package com.dxk.JAVASE;

public class SeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[]{"1","2","3","4","5","6"};
		for (String string : str) {
			if(string != null && "4".equals(string)){
				System.out.println(str);
				//break;
				return;
			}else{
				System.out.println(str);
			}
		}
		
	}

}
