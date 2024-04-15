package lab7.ex2;

import java.util.ArrayList;
import java.util.List;

public class Customers {

	private String name;
	private String address;
	private List<Accounts> listAccount;

	public Customers(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.listAccount = new ArrayList<Accounts>();
	}

	public void addAccount(Accounts accounts) {
		listAccount.add(accounts);
	}

	public void displayInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Infor of ").append(name).append(": \n");
		for (int i = 0; i < listAccount.size(); i++) {
			sb.append(i + 1).append(") ").append(listAccount.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		System.out.println("========================================================================================");
	}

	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", listAccount=" + listAccount + "]";
	}

}
