package www.miu.Collection;

public class Question23 {

	public static void main(String[] args) {
		int a[] = { 4, 9, 6, 15, 21,3};
		int res = isBunkerArray(a);
		System.out.print(res);
	}

	static int isBunkerArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				if (isPrime(a[i + 1])) {
					return 1;
				}
			}

		}
		return 0;
	}

	static int isBunkerArray2(int[] a) {
		for (int i = 0; i<a.length; i++) {
			if (a[i] % 2 != 0 && isPrime(a[i + 1])) {
				return 1;
			}
		}

		return 0;
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
