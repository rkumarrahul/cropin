package com.testyantra.cropintest;

import org.testng.annotations.Test;

import com.testyantra.cropin.genriclib.ExcelUtility;
import com.testyantra.cropin.genriclib.JavaUtility;

public class CreateVendorTest {

	ExcelUtility elib=new ExcelUtility();
	JavaUtility jlib=new JavaUtility();
	@Test
	public void CreateVendor() throws Throwable
	{
		int i=jlib.generateRandomNum();
		if(i%2==0)
		{
			elib.setExcelData("sheet", 1, 0, "pass");
			System.out.println("pass");
		}
		else
		{
			elib.setExcelData("sheet1", 1, 0, "fail");
			System.out.println("fail");
		}
	}
}
