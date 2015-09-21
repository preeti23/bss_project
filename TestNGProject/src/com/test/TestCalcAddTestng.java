package com.test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.dev.Calculator;

public class TestCalcAddTestng {
 Calculator calc = new Calculator();
	@Test
  public void testAdd(){
	  int res;
		res=calc.add_Nums(12,24);
		assertEquals(36,res);
  }
}
