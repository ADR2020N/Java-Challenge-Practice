package www.miu.Collection;

public class Question29 {

	public static void main(String[] args) {
		int a[] = { 5, 3, 14, 7, 18 };
		int res = isTwin(a);
		System.out.print(res);

	}

	static int isTwin(int[] a) {
		boolean hTwin;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				hTwin = false;
				for (int j = 0; j < a.length; j++) {
					if (isPrime(a[j]))
						if ((a[i] - 2 == a[j]) || (a[i] + 2 == a[j])) {
							hTwin = true;
						}
				}
				if (!hTwin) {
					return 0;
				}
			}
		}
		return 1;
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
