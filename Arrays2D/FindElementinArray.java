package Arrays2D;

public class FindElementinArray {

	public static int findelement(int a[],int n) {
		int u=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				u=i+1;
			}
			else {
				u=0;
			}
		}
		return u;
	}
	
	public static void main(String[] args) {
		int a[]= {3,5,78,2,14,6,89,53,39,64};
		int n=6;
		int num=findelement(a,n);
		System.out.println(n+"found at "+num+"th element.");
	}
}
