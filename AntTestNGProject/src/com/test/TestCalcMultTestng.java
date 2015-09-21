package com.test;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.dev.Calculator;

public class TestCalcMultTestng {
	Calculator calc = new Calculator();
	@Test
  public void testMult() {
	  int res;
		res=calc.multiply_Nums(3, 00);
		assertEquals(0,res);
  }
}
