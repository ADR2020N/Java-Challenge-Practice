package www.miu.Collection;

public class Question38 {

	public static void main(String[] args) {
		int a[] = {3, 4, 5, 7};
		int res = isMeera(a);
		System.out.print(res);

	}

	static int isMeera(int[] a) {
   boolean hsmr=false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a.length; j++) {
				if (a[i] + 1 == a[j] || a[i] - 1 == a[j]) {
					hsmr=true;
				}
			}
			if(!hsmr)
			return 0;

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
