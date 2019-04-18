package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPrimeFactorsTest {
	
@Test
public void Check_If_Integer_Is_Positive() {
	
	KataPrimeFactors test = new KataPrimeFactors();
	assertEquals("negative numbers return null", null, test.factorize(-10));
	
}
@Test
public void Prime_2_Returns_Array_2() {
	
	KataPrimeFactors test = new KataPrimeFactors();
	assertEquals("result 2 is an array[2] ",2, test.factorize(2));
}


}









