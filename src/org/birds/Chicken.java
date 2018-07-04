package org.birds;


import java.util.ArrayList;
import java.util.List;

import com.sun.jndi.cosnaming.IiopUrl.Address;

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
	
	private List<Address> createAddresses(int count) {
		List<Address> addresses = new ArrayList<Address>(count);
		for (int i = 0; i < count; i++) {
			addresses.add(createAddress("127.0.0.1", getFlag()));
		}
		return addresses;
	}

	private Address createAddress(String host, boolean trigger) {
		try {
			return new Address(host, trigger);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
