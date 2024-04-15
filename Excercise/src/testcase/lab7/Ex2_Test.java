package testcase.lab7;

import org.junit.Test;

import lab7.ex2.*;

public class Ex2_Test {

	@Test
	public void bankManagementSystem() {

		Bank bank = new Bank("Ngân Hàng Nông Lâm");

		Accounts acc1 = new Savings("SoTaiKhoan01", 0.5);
		Accounts acc2 = new Checking("SoTaiKhoan02", 100000.0);

		Customers cus1 = new Customers("DoMinhPhu", "Tien Giang");
		cus1.addAccount(acc1);
		cus1.addAccount(acc2);

		acc1.deposit(3000000.0);
		System.out.println("========================================================================================");
		cus1.displayInfo();

		acc2.deposit(1500000.0);
		System.out.println("========================================================================================");
		cus1.displayInfo();
		acc1.withdraw(500000.0);
		System.out.println("========================================================================================");
		cus1.displayInfo();
		acc1.transfer(acc2, 1000000);
		System.out.println("========================================================================================");
		cus1.displayInfo();
	}

}
