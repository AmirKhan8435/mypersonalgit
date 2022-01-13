package study.threads.threadsafety;

public class Account {

	private int balance;
	public Account ()
	{
		balance = 10000;
		
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) 
	{
		// Synchronized Block - 
		synchronized(this) {
		this.balance= this.balance+ amount;
		}
		// Code Code Code
	}
	
	// Synchronized Method
	public synchronized void withdraw(int amount) // synchronized keyword to overcome race condtion
	{
		this.balance = this.balance- amount;
	}
	// Both Critical Section must be Synchronized if they both are called
	
	@Override
	public String toString() {
		return "Balance : " + balance;
	}
	
	
	
}
