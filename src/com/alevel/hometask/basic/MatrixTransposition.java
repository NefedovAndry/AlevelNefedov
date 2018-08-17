package com.alevel.hometask.basic;

public class MatrixTransposition {

	public static void matrixPrinting(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] matrixTransposition(int[][] a, int[][] b) {
		
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[][] b = new int[a.length][a[0].length];
		
		System.out.println("Original matrix:");
		matrixPrinting(a);
		System.out.println("\r\nTransposition matrix:");
		matrixPrinting(matrixTransposition(a, b));
	}

}
