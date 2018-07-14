package org.birds;

import org.animals.Dog;
import org.animals.Labrador;

public class Bird {

	
	 int f1;
	 String f2;
	 Dog dog;
	 
	 public void layEgg() {
		Labrador labrador = new Labrador();
		labrador.method3(f1, f2);
		dog.method2(f1, f2);
	 }
	 
	 public void invocationChains() {
		Labrador labrador = new Labrador();
		labrador.method4().substring(0, 10).substring(12).concat("test".substring(0, 10)).substring(17).toCharArray();
	 }

}
