package com.testing.junit.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SomeBuisnessMockTest {

	
//-------------------------------Simple test cases where we are giving data Manually----------------------------------------
	
 @InjectMocks
	SomeBuisnessImpl buisnessImpl= new SomeBuisnessImpl();

 @Mock
	SomeDataService dataServiceMock ;
	
	
	
	@BeforeEach
	public void beforeEach()
	{
		buisnessImpl.setSomeDataservice(dataServiceMock);
	}
	
	
	@Test
	public void testCalculateSumUSingDataService_basic()
	{
		// dataServiceMock getAllData new int[]{1,2,3};
		
		when(dataServiceMock.getAlldata()).thenReturn(new int [] {1,2,3});
		assertEquals(6, buisnessImpl.calculateSumUsingDataService());
	}
	
	
	@Test
	public void testCalculateSumUSingDataService_empty()
	{
		
		// dataServiceMock getAllData new int[]{ };
		
		when(dataServiceMock.getAlldata()).thenReturn(new int [] {});
		assertEquals(0, buisnessImpl.calculateSumUsingDataService());
	}
	
	
	@Test
	public void testCalculateSumUSingDataService_oneValue()
	{
		
		// dataServiceMock getAllData new int[]{6};
		
		when(dataServiceMock.getAlldata()).thenReturn(new int [] {6});
		assertEquals(6, buisnessImpl.calculateSumUsingDataService());
	}
	
}
//______________________________________________________________________________________________________________________















