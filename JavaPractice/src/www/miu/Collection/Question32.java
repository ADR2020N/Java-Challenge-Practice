package www.miu.Collection;

public class Question32 {

	public static void main(String[] args) {
		int a[] = {8, 5, -5, 5, 3};
		int res = isNiceArray(a);
		System.out.print(res);

	}

	static int isNiceArray(int[] a) {
		int sum = 0;
		boolean noPrime = true;

		for (int i = 0; i < a.length; i++) {

			if (isPrime(a[i])) {
				sum = sum + a[i];
				noPrime = false;
			}
		}

		if (a[0] == sum || (noPrime && a[0] == 0)) {
			return 1;
		} else {
			return 0;
		}

    }
	static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}


}
