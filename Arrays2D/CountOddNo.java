package Arrays2D;
//program to count even numbers without using method
public class CountOddNo {

	public static void main(String[] args) {
			int[] a= {56,78,97,95,34,32};
			int b=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]%2!=0) {
					b++;
				}
			}System.out.println(b);
			
	}
}
