package com;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		System.out.println("Program starts");
		int[] a= {10,20,30};
		try {
			System.out.println(a[10]);
			System.out.println(a[20]);
			System.out.println(a[30]);
			System.out.println(a[40]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying access invalid index");
		}
		System.out.println("Program ends");
		
	}

}
