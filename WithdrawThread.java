package study.threads.threadsafety;

public class WithdrawThread implements Runnable {

	Account account;
	public WithdrawThread(Account a) {
		
	this.account=a;
	
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i< 10;i++)
		{
			account.withdraw(100);
			System.out.println("Balance After Withdrawl : " + account.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
}
