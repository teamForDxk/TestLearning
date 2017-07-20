package com.dxk.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IoTest {
	public static void main(String[] args) {
		int count = 0;
		InputStream StreamReader = null;
		try{
			StreamReader = new FileInputStream(
					new File("C:\\Users\\dingxk\\Pictures\\Saved Pictures\\1.png"));
			while(StreamReader.read() != -1){
				count ++ ;
			}
			System.out.println("长度是：" + count);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
