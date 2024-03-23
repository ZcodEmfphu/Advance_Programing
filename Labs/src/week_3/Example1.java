package week_3;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();

		// Add element
		number.add(10);
		number.add(20);
		number.add(30);

		// Access and Print all element
		System.out.println("Many number in ArrayList: ");
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) + " ");
		}

		// Remove element
		System.out.println("\nRemove succes: " + number.get(2));
		number.remove(2);

		// Print many element after delete
		System.out.println("Element after delete: " + number.size());

		System.out.println("ArrayList: " + number);

	}

}
