package newPackage;

public class If {

	public static void main(String[] args) {
		int n = 0;
		int[] arr = new int[0];
		arr[0] = 17;
		String[] strs = {"1", "2"};
		if (n > 0) {
			n++;
			n = n * n + 1;
		} else if (n > 5) {
			n--;
			n = n / n;
		} else {
			n--;
		}
	}

}
