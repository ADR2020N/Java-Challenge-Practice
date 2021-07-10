package www.miu.Collection;

import java.util.Arrays;

public class Quetion31 {

	public static void main(String[] args) {
		int a = 8;
		int res = isSmart2(a);
		System.out.print(res);

	}

	static int isSmart(int n) {
		int smart = 1;
		for (int i = 1; smart < n; i++) {
			smart = smart + i;
		}
		return smart == n ? 1 : 0;
	}

	static int isSmart2(int n) {
		int smart = 1;
		for (int i = 1; smart < n; i++) {
			smart = smart + i;
		}
		if (smart == n)
			return 1;
		else
			return 0;
	}

}
