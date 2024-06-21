package final_.ex1;

public class FindNumber {

	 public void findNumber(int[] arr, int num) {
	        boolean found = false;
	        // Loop through each element in the array
	        for (int i = 0; i < arr.length; i++) {
	            // Loop through the elements after the current element
	            for (int j = i + 1; j < arr.length; j++) {
	                // Check if the sum of two elements equals the given number
	                if (arr[i] + arr[j] == num) {
	                    System.out.println(arr[i] + "\t" + arr[j]);
	                    found = true;
	                }
	            }
	        }
	        // Print message if no pairs found
	        if (!found) {
	            System.out.println("No pairs found that sum to " + num);
	        }
	    }

	    public static void main(String[] args) {
	        FindNumber findNumber = new FindNumber();
	        int arr[] = { 1, 2, 3, 4, 5 };
	        findNumber.findNumber(arr, 5);  // Change the sum to demonstrate the functionality
	    }

}
