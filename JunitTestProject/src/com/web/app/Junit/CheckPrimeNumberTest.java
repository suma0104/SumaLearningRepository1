package com.web.app.Junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.web.app.CheckPrimeNumber;

@RunWith(Parameterized.class)
public class CheckPrimeNumberTest {
	private CheckPrimeNumber p;
	private Integer inputNumber;
	private Boolean isPrime;
	
	@Before
	public void before(){
		p=new CheckPrimeNumber();
	}
	
	public CheckPrimeNumberTest(Integer inputNumber,Boolean isPrime){
		this.inputNumber=inputNumber;
		this.isPrime=isPrime;
	}
	
	@Parameterized.Parameters
	public static Collection inputNumbers(){
		List list=Arrays.asList(new Object[][]{
			{2,false},
			{3, true},
			{6,false},
			{7, false}
		});
		return list;
	
	}
	
	@Test
	public void testIsPrimeNumber() {
	
		assertEquals(isPrime,p.isPrimeNumber(inputNumber));
	}

	
	
	
	
	
	
	
}
