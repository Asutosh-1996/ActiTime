package com.actitime.testscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider="getCartData")
	public void testAddToCart(String cat,String prdname,String qty) {
		System.out.println("category = "+cat+"  productname = "+prdname+"  quantity = "+qty);
	}
	
	@DataProvider
	public Object[][] getCartData(){
	Object[][] obj=new Object[3][3];
	obj[0][0]="mobile";
	obj[0][1]="i phone";
	obj[0][2]="3";
	
	obj[1][0]="TV";
	obj[1][1]="Samsung 55";
	obj[1][2]="10";
	
	obj[2][0]="TV";
	obj[2][1]="Mi 4x 55";
	obj[2][2]="10";
	return obj;	
	}
}
