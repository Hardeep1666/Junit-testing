package com.testing.junit.buisness;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBuisnessImpl {

	public int calculateSum(int []data)
	{
		int sum=0;
		for(int value:data)
		{
			
			sum+=value;
		}
		return sum;
	}

	
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
			
			sum+=value;
		}
		return sum;

	}
}
