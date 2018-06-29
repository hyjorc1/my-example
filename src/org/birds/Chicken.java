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

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i] + 1 + i + 10;
			if (f1 > 0) {
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				int temp2 = arr[j];
				temp += temp2;
				break;
			}
		}
		int count = 0;

		while (count < 10) {
			arr[count]++;
		}

		do {
			int a = 0;
		} while (count > 10);

		int mark = 1;
		int mark2 = 9;
		if (mark == 0) {
			count = 0;
			mark = 1 + mark + 14;
		} else if (mark < 0) {
			mark++;
			mark2--;
		} 

		method1(extracted(f1, f2), f2);

		return count;
	}

	private int extracted(int e1, String s2) {
		return e1;
	}

	private synchronized void  method1(int arg1, String arg2) {
		f1++;
	}
}
