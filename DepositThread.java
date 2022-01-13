package study.threads.threadsafety;

public class DepositThread implements Runnable{

	
	Account account;
	
	public DepositThread(Account a) {
		this.account = a;
	}
	@Override
	public void run() {
	
		for(int i =0 ;i <10;i++)
		{
			account.deposit(1000);
			System.out.println("Balance after Deposit : " + account.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
