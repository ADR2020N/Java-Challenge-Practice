package www.miu.Collection;

public class Question25 {

	public static void main(String[] args) {
		int n = 3;
		int res = isMeera(n);
		System.out.print(res);

	}

	static int isMeera(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count>0 && n % count == 0 ) {
			return 1;
		} else {
			return 0;
		}

	}

}
