package www.miu.Collection;

public class Question30 {

	public static void main(String[] args) {
		int a[] = { 1, 7, 8 };
		int b[] = { 1, 7, 6 };
		int res = isSetEqual(a, b);
		System.out.print(res);

	}

	static int isSetEqual(int[] a, int[] b) {
		boolean setEqual;
		for (int i = 0; i < a.length; i++) {
			setEqual = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					setEqual = true;
				}
			}
			if (!setEqual)
				return 0;
		}

		return 1;
	}

}
