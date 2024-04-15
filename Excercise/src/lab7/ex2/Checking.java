package lab7.ex2;

public class Checking implements Accounts {

	private String accountNumber;
	private double balance;
	private double overdraftLimit;

	public Checking(String accountNumber, double overdraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited " + amount + " into checkings account " + accountNumber);
	}

	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdraw " + amount + " into checking account " + accountNumber);
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Checking account " + accountNumber + " has a balance of " + balance);

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
		return "Checking [accountNumber=" + accountNumber + ", balance=" + balance + ", overdraftLimit="
				+ overdraftLimit + "]";
	}

}
