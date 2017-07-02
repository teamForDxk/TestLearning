package BankDemo;
/**
 * 账户信息类
 * <p>Title: Account</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	Dxk
 * @date	2017年7月2日下午9:33:46
 * @version 1.0
 */
public class Account {
	private String AccounNo;//账户卡号
	private double balance;//账户金额
	
	public Account(){
		
	}
	public Account(String AccounNo,double balance){
		super();
		this.AccounNo = AccounNo;
		this.balance = balance;
	}
	public String getAccounNo() {
		return AccounNo;
	}
	public void setAccounNo(String accounNo) {
		AccounNo = accounNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}
