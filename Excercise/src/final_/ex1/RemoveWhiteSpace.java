package final_.ex1;

public class RemoveWhiteSpace {

	public String removeWhiteSpace(String s) {
		// Tính toán độ dài mới sau khi loại bỏ khoảng trắng
		int newLength = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				newLength++;
			}
			System.out.println(newLength);
		}

		// Tạo mảng ký tự mới với độ dài mới
		char[] newArr = new char[newLength];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				newArr[index++] = s.charAt(i);
			}
		}

		// Chuyển mảng ký tự mới thành chuỗi
		return new String(newArr);
	}

	public static void main(String[] args) {
		RemoveWhiteSpace utils = new RemoveWhiteSpace();
		String str = "Hello";

		// Gọi phương thức removeWhiteSpace để loại bỏ khoảng trắng
		String result = utils.removeWhiteSpace(str);

		// In chuỗi ban đầu và chuỗi sau khi loại bỏ khoảng trắng
		System.out.println("Chuỗi ban đầu: " + str);
		System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: " + result);
	}

}
