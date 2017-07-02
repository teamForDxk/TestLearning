package BankDemo;

public class DrawMoneyThread extends Thread{
	private Account account;//账户实体类
	private double drawMoneyCount;//取钱金额
	
	public DrawMoneyThread(String name,Account account,double drawMoneyCount){
		super(name);
		this.account = account;
		this.drawMoneyCount = drawMoneyCount;
	}

	public void run() {
		// TODO Auto-generated method stub
		/*if(account.getBalance() >=  drawMoneyCount){
			System.out.println(getName() + "取走现金："+ drawMoneyCount);
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			account.setBalance(account.getBalance() - drawMoneyCount);
			System.out.println("余额为："+ account.getBalance());
		}else{
			System.out.println(getName() + "余额不足，不可以取走现金！");
		}*/
		//以上为资源没有被锁定的实现，是错误的！
		/* 
		 *  Java的多线程支持引入了同步监视器来解决这个问题，使用同步监视器的通用方法就是同步代码块。
		 *  同步代码块的语法格式如下： 
    		synchronized（obj）{
				....
    		}
		 * */
		synchronized (account) {
			if(account.getBalance() >=  drawMoneyCount){
				System.out.println(getName() + "取走现金："+ drawMoneyCount);
				try {
					sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - drawMoneyCount);
				System.out.println("余额为："+ account.getBalance());
			}else{
				System.out.println(getName() + "余额不足，不可以取走现金！");
			}
		}
	}
	
	 

}
