package Arrays2D;

import java.security.DomainCombiner;
import java.util.Scanner;

public class TransposeMatrix {
	static Scanner sc=new Scanner(System.in);
	private static int[][] readMatrix(){
		System.out.println("enter the number of rows and colums of matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m[][]=new int [r][c];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		return m;		
	}
	
	private static int[][] transposem(int t[][]){
		int trp[][]=new int [t[0].length][t.length];
		for(int i=0;i<t[0].length;i++) {
			for(int j=0;j<t.length;j++) {
				trp[i][j]=t[j][i];
			}
		}
		return trp;
	}
	public static void main(String args[]) {
		int m[][]=readMatrix();
		int t[][]=transposem(m);
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t[0].length;j++) {
				System.out.print(t[i][j]);
			}System.out.println();
	}
	}
}	