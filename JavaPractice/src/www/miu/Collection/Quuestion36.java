package www.miu.Collection;

public class Quuestion36 {

	public static void main(String[] args) {
		int a[] = {2, 5, 2, 5, 5, 2, 5};
		int res = isTriple(a);
		System.out.print(res);

	}

	static int isTriple(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					count++;
					if (count == 3)
						return 1;
				}
			}
		}
		return 0;
	}

}
