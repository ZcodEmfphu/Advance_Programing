package test;

public class Ex2 {

	public static boolean checkYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;

	}

	public static int checkDay(int month, int year) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			month = 31;
			break;
		case 2:
			if (checkYear(year)) {
				month = 29;
			} else {
				month = 28;
			}
			break;
		case 4, 6, 9, 11:
			month = 30;
		}
		return month;
	}

}
