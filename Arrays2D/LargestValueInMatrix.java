package Arrays2D;

import java.util.Scanner;

public class LargestValueInMatrix {
	
	public static int largestElement(int m[][]) {
		int largest= m[0][0];
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j]>largest) {
					largest=m[i][j];
				}
			}
		}
		return largest;
	}

	@SuppressWarnings("resource")
	public static int[][] readMatrix() {
		System.out.println("Enter the rows and columns of the martrix");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter the elements of Matrix");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int m[][]=readMatrix();
		System.out.println(largestElement(m));
		
	}
}
