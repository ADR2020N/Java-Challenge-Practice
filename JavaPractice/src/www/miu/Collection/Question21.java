package www.miu.Collection;

public class Question21 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 10, 11, 12};
		int res = isBean(a);
		System.out.print(res);

	}

	static int isBean(int[] a) {
		boolean has9 = false, has13 = false, has7 = true, has16 = false;
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case 9:
				has9 = true;
				break;
			case 13:
				has13 = true;
				break;
			case 7:
				has7 = true;
				break;
			case 16:
				has16 = true;
				break;
			default:
				break;
			}
			
		}
		if ((!has9 && !has13) || (has9 && !has13) || (has7 && has16) || (has7 && has16))
			return 0;
		return 1;
	}
}
