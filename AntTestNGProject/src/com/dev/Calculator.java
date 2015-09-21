package com.dev;

public class Calculator {
	public int add_Nums(int a, int b)
	{
		return a+b;
	}
	
	public int substract_Nums(int a, int b)
	{
		return a-b;
	}
	
	public int multiply_Nums(int a, int b)
	{
		return a*b;
	}
	
	public int divide_Nums(int a, int b)
	{
		if (b!=0) 
			return a/b;
		else
			return 0;
	}
}

