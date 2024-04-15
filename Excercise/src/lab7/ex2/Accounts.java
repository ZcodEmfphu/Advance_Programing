package lab7.ex2;

public interface Accounts {

	public void deposit(double amount);

	public void withdraw(double amount);

	public void checkBalance();

	public void transfer(Accounts destinationAccount, double amount);

	public String getAccountNumber();

}
