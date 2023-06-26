package Arrays2D;

public class Sumof2Elem {
	public static void main(String[] args) {
		int [] a= {1,3,6,2,5,4,3,2,4};
		int sum=8, count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println("("+a[i]+","+a[j]+")");
					count++;
				}
			}
		}System.out.println(count);
	}

}
