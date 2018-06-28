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
			int temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				int temp2 = arr[j];
				temp += temp2;
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
		if (mark == 0) {
			count = 0;
		} else if (mark < 0) {
			mark++;
		} else {
			try {
				mark--;
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		this.method1(f1, f2);


		return count;
	}

	private synchronized void  method1(int arg1, String arg2) {
		f1++;
	}
}
