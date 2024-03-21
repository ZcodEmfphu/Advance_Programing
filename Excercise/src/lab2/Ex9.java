package lab2;

public class Ex9 {

	public static String docSo(int n) {
		if (n == 0) {
			return "Không";
		}

		int tram = n / 100;
		int chuc = (n % 100) / 10;
		int donVi = n % 10;

		String result = "";

		switch (tram) {
		case 1:
			result += "Một trăm ";
			break;
		case 2:
			result += "Hai trăm ";
			break;
		case 3:
			result += "Ba trăm ";
			break;
		case 4:
			result += "Bốn trăm ";
			break;
		case 5:
			result += "Năm trăm ";
			break;
		case 6:
			result += "Sáu trăm ";
			break;
		case 7:
			result += "Bảy trăm ";
			break;
		case 8:
			result += "Tám trăm ";
			break;
		case 9:
			result += "Chín trăm ";
			break;
		}

		switch (chuc) {
		case 0:
			break;
		case 1:
			result += "mười ";
			break;
		case 2:
			result += "hai mươi ";
			break;
		case 3:
			result += "ba mươi ";
			break;
		case 4:
			result += "bốn mươi ";
			break;
		case 5:
			result += "năm mươi ";
			break;
		case 6:
			result += "sáu mươi ";
			break;
		case 7:
			result += "bảy mươi ";
			break;
		case 8:
			result += "tám mươi ";
			break;
		case 9:
			result += "chín mươi ";
			break;
		}

		switch (donVi) {
		case 0:
			break;
		case 1:
			result += "một";
			break;
		case 2:
			result += "hai";
			break;
		case 3:
			result += "ba";
			break;
		case 4:
			result += "bốn";
			break;
		case 5:
			result += "năm";
			break;
		case 6:
			result += "sáu";
			break;
		case 7:
			result += "bảy";
			break;
		case 8:
			result += "tám";
			break;
		case 9:
			result += "chín";
			break;
		}

		return result.trim();
	}
}
