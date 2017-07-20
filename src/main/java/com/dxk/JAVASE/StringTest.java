package com.dxk.JAVASE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		String str = "1asdasdasd";
		//一下方法得出，str的首字符是否为数字
		//方法1：JAVA自带函数
		boolean b1 = Character.isDigit(str.charAt(0));
		//方法2：正则表达式
		boolean b2 = false;
		Pattern pattern = Pattern.compile("[0-9]*");
		  Matcher isNum = pattern.matcher(str);
		  if(!isNum.matches()){
			 b2 = false;
		  }else{
			  b2 = true;
		  }
		//charAt(int i)得到的是索引为i的字符
		
	}

}
