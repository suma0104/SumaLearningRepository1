package com.web.app;

public class CheckPrimeNumber {

	public boolean isPrimeNumber(Integer primeNumber)
	{
		for (int i = 2; i < (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	}
}
