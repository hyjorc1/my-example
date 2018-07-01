package org.birds;


import com.sun.org.apache.xpath.internal.operations.String;

public class Chicken extends Bird {

	int f1;
	String f2;

	public Chicken(int f1, String f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public int cackle() {

		System.out.println("cackle");
		int[] arr = {};

		int count = 0;
		int mark = 0;

		if (mark == 0) {
			count = 0;
		} else if (mark < 0) {
			mark++;
		} 

		method1(extracted(f1, f2), f2);

		return count;
	}

	private int extracted(int e1, String s2) {
		return e1;
	}

	Bird bird;

	public void method1(int arg1, String arg2) {
		f1++;
		f1 = bird.method2(f1, f2);
		extracted(f1, f2);
	}
}
