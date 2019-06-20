package com.covalense.java.map;

public class CopyArr2 {
	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };

		int[] b = { 30, 40, 50, 60, 70, 80 };
		int k = 0;
		for (int i = 1; i < b.length-3; i++) {
			b[i] = a[k++];
		}

		for (int l = 0; l < b.length; l++) {
			System.out.print(b[l]+" ");
		}
	}
}
