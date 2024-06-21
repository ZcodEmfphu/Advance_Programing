package final_.ex1;

public class FindNumber {

	public void findNumber(int[] arr, int num) {
		boolean found = false;
		// Duyệt qua từng phần tử trong mảng
		for (int i = 0; i < arr.length; i++) {
			// Kiểm tra nếu phần tử hiện tại bằng số cần tìm
			if (arr[i] == num) {
				System.out.println("Value: " + arr[i] + ", Index: " + i);
				found = true;
			}
		}
		// Nếu không tìm thấy phần tử nào
		if (!found) {
			System.out.println("Không tìm thấy giá trị: " + num + " trong mảng.");
		}
	}

	public static void main(String[] args) {
		FindNumber findNumber = new FindNumber();
		int arr[] = { 1, 2, 3, 4, 5 };
		findNumber.findNumber(arr, 7);
	}
}
