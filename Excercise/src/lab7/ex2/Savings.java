package lab7.ex2;

public class Savings implements Accounts {
	private String accountNumber;
	private double balance;
	private double interestRate;

	public Savings(String accountNumber, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited " + amount + " into savings account " + accountNumber);
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw " + amount + " into savings account " + accountNumber);
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("Saving account " + accountNumber + " has a balance of " + balance);

	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;

	}

	@Override
	public void transfer(Accounts destinationAccount, double amount) {
		if (balance >= amount) {
			withdraw(amount);
			destinationAccount.deposit(amount);
			System.out.println("Transferred " + amount + " from account " + accountNumber + " to account "
					+ destinationAccount.getAccountNumber());
		} else {
			System.out.println("Transfer failed. Insufficient funds or invalid amount.");
		}
	}

	@Override
	public String toString() {
		return "Savings [accountNumber=" + accountNumber + ", balance=" + balance + ", interestRate=" + interestRate
				+ "]";
	}

	

}
