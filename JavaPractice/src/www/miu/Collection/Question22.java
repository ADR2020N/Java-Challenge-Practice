package www.miu.Collection;

public class Question22 {

	public static void main(String[] args) {
		int n=543;
		int d=3;
		int res = countDigit(n,d);
		System.out.print(res);

	}

	static int countDigit(int n, int digit) {
		int d = 0, count = 0;
		if(n<0 || d<0) return 0;
		while (n > 0) {
			d = n % 10;
			n /= 10;
			if (d == digit) {
				count++;
			}
		}
		return count;

	}

}
