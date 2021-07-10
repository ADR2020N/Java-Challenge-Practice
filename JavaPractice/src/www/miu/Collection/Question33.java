package www.miu.Collection;

public class Question33 {

	public static void main(String[] args) {
		int a[] = {2, 3, 2, 4,11, 6, 10, 9, 8};
		int res = isComplete(a);
		System.out.print(res);
	}

	static int isComplete(int[] a) {
		boolean hasEven=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0 && a[i]>0) {
				return 1;
				}
			}
		
		
		return 0;
	}

}