package www.miu.Collection;

public class Question24 {

	public static void main(String[] args) {
		int a[] = { 3, 5, -2 };
		int res = isMeera(a);
		System.out.print(res);
	}

	static int isMeera(int[] a) {
		boolean has2times = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] * 2 == a[j]) {
					return 1;
				}
			}
		}

		return 0;
	}

}
