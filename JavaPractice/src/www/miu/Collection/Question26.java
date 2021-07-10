package www.miu.Collection;

public class Question26 {

	public static void main(String[] args) {
		int a[] = { 6, 10, 1 };
		int res = isBunker(a);
		System.out.print(res);

	}

	static int isBunker(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i]))

				for (int j = 0; j < a.length; j++) {
					if (a[j] == 1)
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
