package com.dxk.Ipay;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 抢红包
 * @author 123
 *
 */
public class Winxin {
	public static void main(String[] args) {
		System.out.println("请输入红包金额：（例如2.5元）");
		Scanner scanner=new Scanner(System.in);
		double f = scanner.nextDouble();
		if(f<0.01){
			System.err.println("金额最少为0.01元");
			main(args);
		}else{
	    BigDecimal b=new BigDecimal(f);
		double f1=b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(f1);
		int total=(int)(f1*100);
		System.out.println("请输入红包个数：");
		int num=scanner.nextInt();
		int num2=num;
		if(num<1){
			System.err.println("红包个数不能小于1");
		}else if(f<num*0.01){
			System.err.println("请保证每个红包的金额不少于0.01");
			main(args);
		}else{
			
		int[] money=new int[num];
		if(num==1){
			money[0]=total;
		}
		for(int i=0;i<money.length-1;i++){
			
			money[i]=((int)(Math.random()*((int)total/num))+1);
			total-=money[i];
			num--;
			if(i==money.length-2){
				money[money.length-1]=total;
			}
		}
		for(int i=0;i<num2;i++){
				System.out.println("----");
			String y=(money[i]/100+"");//元
			int j=(money[i]-money[i]/100*100-money[i]%10);
			String ff=(money[i]%10+"");//分
				String jf=null;
			if(j==0){
				jf="0".concat(ff);
			}else{
				jf=(money[i]-money[i]/100*100-money[i]%10+money[i]%10+"");//角+分
			}
			String mm=y.concat(".").concat(jf);
			System.out.println("红包"+(i+1)+":"+mm+"元");
			
			
		}
		}
	}
	}
	
}
