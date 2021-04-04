package com.testyantra.cropin.genriclib;

import java.util.Random;

public class JavaUtility {
	
	public int  generateRandomNum() {
		Random random = new Random();
		 int randomInt = random.nextInt(10000);

		 return randomInt;
	}

	

}
