package www.miu.Collection;

public class Question28 {

	public static void main(String[] args) {
		int a = 130;
		int res = isContinuousFactored(a);
		System.out.print(res);
	}
	static int isContinuousFactored(int n) {
		boolean isCon = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				for (int j = 2; j < n; j++) {
					if (n % j == 0)
						if (j * i == n)
					isCon = true;
				}
			if (!isCon)
				return 0;
		}
		return 1;
	}

}
