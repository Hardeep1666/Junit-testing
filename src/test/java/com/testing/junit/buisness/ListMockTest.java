package com.testing.junit.buisness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ListMockTest {

	
	@Test
	public void size_basic()
	{
		List mock=mock(List.class);
		
		when(mock.size()).thenReturn(5);
		when(mock.size()).thenReturn(10);
	}
	
	@Test
	public void retrunDifferentValues()
	{
		List mock=mock(List.class);
		
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}
}
	