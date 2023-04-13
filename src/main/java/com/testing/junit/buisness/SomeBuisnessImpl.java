package com.testing.junit.buisness;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBuisnessImpl {
//--------------simple method where we are providing data---------------------------- 
	public int calculateSum(int []data)
	{
		int sum=0;
		for(int value:data)
		{
			//sum=sum+value;
			sum+=value;
		}
		return sum;
	}
//--------------calling data service to get data--------------------
	
	@Autowired
	private SomeDataService  dataservice;
	
	
	
	public void setSomeDataservice(SomeDataService dataservice) {
		this.dataservice = dataservice;
	}


	public int calculateSumUsingDataService() {
		int sum=0;
		int data[]= dataservice.getAlldata();
		
		for(int value:data)
		{
			//sum=sum+value;
			sum+=value;
		}
		return sum;

	}
}
