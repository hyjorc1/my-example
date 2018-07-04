package org.birds;


import com.sun.jndi.cosnaming.IiopUrl.Address;
import com.sun.org.apache.xpath.internal.operations.String;

public class Chicken extends Bird {

	int f1;
	String f2;
	boolean flag;

	public Chicken(int f1, String f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public int cackle() {
		switch (f1) {
		case 1: f1 = 2;
		case 2: f1 = 3;
		default: break;
		}
		return f1;
	}
	
	public boolean getFlag() {
		return flag;
	}
	
	private Address[] createAddresses(int count) {
		Address[] addresses = new Address[count];
		for (int i = 0; i < count; i++) {
			try {
				addresses[i] = new Address("127.0.0.1", getFlag());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return addresses;
	}
}
