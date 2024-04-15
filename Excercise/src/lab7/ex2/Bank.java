package lab7.ex2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private List<Customers> listCuscomer;

	public Bank(String name) {
		super();
		this.name = name;
		this.listCuscomer = new ArrayList<Customers>();
	}

}
