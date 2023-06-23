package Arrays2D;

import java.util.Scanner;

public class CountOfPrimeNo {
	public static boolean isPrime(int n) {
		if(n<=1) {return false;	}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
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
		int p=0;
		int a[][]=readMatrix();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(isPrime(a[i][j])) {
					p++;
				}
			}
		}System.out.println(p);
	}


	
}
