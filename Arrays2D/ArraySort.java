package Arrays2D;

public class ArraySort {
	
//	find the second largest element in the array.
	
	public static int[] bubbleSort(int arr[]){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=t;
				}
			}
		} return arr;
	}

	
	public static int[] selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
		} return arr;
	}
	public static void main(String[] args) {
		int arr[]= {7,18,74,63,48,23};
		int[] b=bubbleSort(arr);
		for(int c:b) {
			System.out.print(c+" ");
		}
		
	}
}
