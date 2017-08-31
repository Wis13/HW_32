package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
	@RunWith(Parameterized.class)
	public class Multiply4ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {1} * {2} * {3} * {4} = {0}")
       public static Collection<Double[]> multiplyNumbers() {
            return Arrays.asList(new Double[][] {
                           { 504.0, 12.0, 3.0, 2.0, 7.0 }, // { 0.5, 1.0, 2.0, 34.0 }, 
                           { 1728.0, 18.0, 3.0, 4.0, 8.0 }, // { 0.66, 2.0, 3.0, 22.0 }, 
                           { 672.0, 28.0, 2.0, 2.0, 6.0 }, // { 0.75, 3.0, 4.0, 13.0 }, 
                           { 4480.0, 112.0, 4.0, 5.0, 2.0 }, // { 0.8, 4.0, 5.0, 71.3 },
              });}
       @Parameter(value = 0) public Double expected;
       @Parameter(value = 1) public Double first;
       @Parameter(value = 2) public Double second;
       @Parameter(value = 3) public Double third;
       @Parameter(value = 4) public Double fourth;
       
       @Test
       public void multiply() {
    	      System.out.println(first + " * " + second + " * " + third + " * " + fourth + " = " + expected);
              assertEquals("Not correct", Calculator.multiply(first, second, third, fourth), expected, 0.09);
}}