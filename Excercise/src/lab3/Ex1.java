package lab3;

public class Ex1 {

	public static String calculateIntegers(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return "Array empty";
		}
		int sum = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {
			sum += num;
			count++;
			if (num > max) {
				max = num;
			}
		}
		double average = (double) sum / count;
		return sum + " " + average + " " + max;
	}

	public static void main(String[] args) {
		int[] numbers = { 5, 7, 2, 10, 8 };
		System.out.println(calculateIntegers(numbers));
		calculateIntegers(numbers);

	}

}
