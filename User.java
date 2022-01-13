package study.threads.threadsafety;

public class User {

	public static void main(String[] args) {
		
		Account shared = new Account();
		Thread deposit = new Thread(new DepositThread(shared));
		Thread withdraw = new Thread(new WithdrawThread(shared));
		
		deposit.start();
		withdraw.start();
		 
		System.out.println("Main Ends....."); 
		// Race Condtion may Occur or may-Not
		//Account is shared and thread is unsafe
	}

}
