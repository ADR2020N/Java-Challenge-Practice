package www.miu.Collection;

public class Question27 {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 7 };
		int res = isNice(a);
		System.out.print(res);

	}

	static int isNice(int[] a) {
		boolean hasElement;
		for (int i = 0; i < a.length; i++) {
			hasElement = false;
			for (int j = 0; j < a.length; j++) {
				if (a[i] + 1 == a[j] || a[i] - 1 == a[j]) {
					hasElement = true;
				}
			}
			if (!hasElement)
				return 0;

		}

		return 1;
	}
}
