package com.testyantra.cropintest;

import org.testng.annotations.Test;

import com.testyantra.cropin.genriclib.ExcelUtility;
import com.testyantra.cropin.genriclib.JavaUtility;

public class CreatePurchaseOrderTest {
	ExcelUtility elib=new ExcelUtility();
	JavaUtility jlib=new JavaUtility();
	@Test
	public void createContact() throws Throwable
	{
		int i=jlib.generateRandomNum();
		if(i%2==0)
		{
			elib.setExcelData("sheet1", 4, 0, "pass");
			System.out.println("pass");
		}
		else
		{
			elib.setExcelData("sheet1", 4, 0, "fail");
			System.out.println("fail");
		}
	}
}
