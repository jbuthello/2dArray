package Arrays2D;
//WAJP to find the sum of even and odd numbers in an array
public class SumofEvenOdd {
	
	public static void sumOfEvenOdd(int arr[]) {
		int even_sum=0, odd_sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_sum=even_sum+arr[i];
			}else if(!(arr[i]%2==0)) {
				odd_sum=odd_sum+arr[i];}
			else { }
			}
		System.out.println("sum of even numbers is= "+even_sum+"\n sum of odd numbers is= "+odd_sum);
		}
	
public static void main(String[] args) {
	int [] a= {1,3,6,2,5,4,3,2,4};
	sumOfEvenOdd(a);
}
	

}
