package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InValid {
	
@Test(dataProvider="getLogin")
public void testInvalidLogin(String un,String pw) {
	Reporter.log("username = "+un,true);
	Reporter.log("password = "+pw,true);
}
	
	
@DataProvider
public Object[][] getLogin(){
	Object[][] obj=new Object[2][2];
	obj[0][0] ="admin1";
	obj[0][1]="manager1";
	obj[1][0] ="admin2";
	obj[1][1]="manager2";
return obj;	
}
}
