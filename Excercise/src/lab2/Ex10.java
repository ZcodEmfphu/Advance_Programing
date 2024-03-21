package lab2;

public class Ex10 {

	public static boolean isValidDate(int d, int m, int y) {
		switch (m) {
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				return (d >= 1 && d <= 29);
			} else {
				return (d >= 1 && d <= 28);
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return (d >= 1 && d <= 30);
		default:
			return (d >= 1 && d <= 31);
		}
	}

	public static String nextDay(int d, int m, int y) {
		int nextD = d + 1;
		int nextM = m;
		int nextY = y;

		switch (m) {
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				if (nextD > 29) {
					nextD = 1;
					nextM++;
				}
			} else {
				if (nextD > 28) {
					nextD = 1;
					nextM++;
				}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (nextD > 30) {
				nextD = 1;
				nextM++;
			}
			break;
		default:
			if (nextD > 31) {
				nextD = 1;
				nextM++;
			}
			break;
		}

		if (nextM > 12) {
			nextM = 1;
			nextY++;
		}

		return nextD + "/" + nextM + "/" + nextY;
	}

	public static String checkDay(int d, int m, int y) {
		if (isValidDate(d, m, y)) {
			String nextDay = nextDay(d, m, y);
			return "Ngày hôm sau là: " + nextDay;
		} else {
			return "Ngày không hợp lệ!";
		}
	}
}
