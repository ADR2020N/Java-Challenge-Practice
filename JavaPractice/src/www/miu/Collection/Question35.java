package www.miu.Collection;

public class Question35 {

	public static void main(String[] args) {
		int a[] = {-4, 0, 1, 0, 2, 1};
		int res = isMeera(a);
		System.out.print(res);

	}

	static int isMeera(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < i) {
				sum += a[i];
			}
		}
		if (sum == 0)
			return 1;
		return 0;
	}

}
