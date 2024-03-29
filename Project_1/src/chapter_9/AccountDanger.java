package chapter_9;

class Account {
	private int balance = 50;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amount){
		balance = balance - amount;
	}
}

public class AccountDanger implements Runnable {
	private Account acct = new Account();
	
	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		Thread one 		= new Thread(r);
		Thread two 		= new Thread(r);
		one.setName("Fred(Thread-1)");
		two.setName("Lucy(Thread-2)");
		one.start();
		two.start();		
	}
	
	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			System.out.println("-------------------------------");
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex) { }	
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName()	+ " completes the withdrawal");
		}else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() 
					+ " to withdraw " + acct.getBalance());
		}
	}
}	


