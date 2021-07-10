package www.miu.Collection;

public class Question34 {

	public static void main(String[] args) {
		int a = 10;
		int b = 33;
		int res = factorEqual(a, b);
		System.out.print(res);

	}

	static int factorEqual(int n, int m) {
		int countN = 0, countM = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				countN++;
			}
		}
		for (int j = 1; j <= m; j++) {
			if (n % j == 0) {
				countM++;
				System.out.print(j);
			}

		}

		if (countM == countN)
			return 1;
		return 0;
	}

}
