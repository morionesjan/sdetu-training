package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println("Factorial: " + fact(0));
		
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Sum: " + findAvg(numbers));

	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i=0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			}
		
		return min;
	}
	
	public static int findMax(int[] arr) {
		int min = arr[0];
		for (int i=0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
			}
		
		return min;
	}
	
	public static int findAvg(int[] arr) {
	    int sum = 0;
	    for (int i=0; i < arr.length; i++) {
	        sum = sum + arr[i];
	    }
	    return sum / arr.length;
	}
	
	
	public static int sum(int n) {
		int sum = 0;
		for (int i=1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}

	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		
		return fact(n-1) * n;
	}
}
