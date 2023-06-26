package Arrays2D;
//	WAJP to find the largest element in the element
public class LargestElement {
	
	public static int largestElement(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		int [] a= {1,3,6,2,5,4,3,2,4};
		System.out.println("largest element in the array="+largestElement(a));
	}	
}
