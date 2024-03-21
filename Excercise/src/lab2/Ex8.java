package lab2;

public class Ex8 {
	public static String namAmLich(int year) {
		int canIndex = (year - 4) % 10;
		int chiIndex = (year - 4) % 12;

		String can = "";
		String chi = "";
		
		switch (canIndex) {
		case 0:
			can = "Giáp";
			break;
		case 1:
			can = "Ất";
			break;
		case 2:
			can = "Bính";
			break;
		case 3:
			can = "Đinh";
			break;
		case 4:
			can = "Mậu";
			break;
		case 5:
			can = "Kỷ";
			break;
		case 6:
			can = "Canh";
			break;
		case 7:
			can = "Tân";
			break;
		case 8:
			can = "Nhâm";
			break;
		case 9:
			can = "Quý";
			break;
		}

		switch (chiIndex) {
		case 0:
			chi = "Tý";
			break;
		case 1:
			chi = "Sửu";
			break;
		case 2:
			chi = "Dần";
			break;
		case 3:
			chi = "Mão";
			break;
		case 4:
			chi = "Thìn";
			break;
		case 5:
			chi = "Tỵ";
			break;
		case 6:
			chi = "Ngọ";
			break;
		case 7:
			chi = "Mùi";
			break;
		case 8:
			chi = "Thân";
			break;
		case 9:
			chi = "Dậu";
			break;
		case 10:
			chi = "Tuất";
			break;
		case 11:
			chi = "Hợi";
			break;
		}

		return can + " " + chi;
	}

}
