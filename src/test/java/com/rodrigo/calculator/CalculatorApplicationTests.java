package com.rodrigo.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rodrigo.calculator.service.Calculator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorApplicationTests {

	Calculator calculator = new Calculator();
	
	@Test
	public void contextLoads() {
		assertEquals(5, calculator.sum(3, 2));
	}

}
