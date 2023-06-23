package Arrays2D;

import java.util.Scanner;

public class Add2Matrix {
	static Scanner sc=new Scanner(System.in);
	public static int [][] addMatrix(int a[][], int b[][]){
		int r[][]=new int[a.length][a[0].length];
		if(a.length!=b.length && a[0].length!=b[0].length) {
			return null;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				r[i][j]=a[i][j]+b[i][j];
			}
		}
		return r;
	}

	public static int [][] readMateix(){
		System.out.println("enter the number of rows and columns of matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int [r][c];
		int b[][]=new int [r][c];
		System.out.println("Enter the values in first matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the values in second matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int er[][]=addMatrix(a, b);
		return er;
	}
	
	public static void main(String[] args) {
		
		int er[][]=readMateix();
		for(int i=0;i<er.length;i++) {
			for(int j=0;j<er.length;j++) {
				System.out.print(er[i][j]+" ");
			}System.out.println();
		}
	}
}
