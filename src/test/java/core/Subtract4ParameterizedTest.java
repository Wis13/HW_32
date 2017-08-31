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
	public class Subtract4ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {0} - {1} - {2} -{3} = {4}")
       public static Collection<Double[]> subtractNumbers() {
            return Arrays.asList(new Double[][] {
                           { 22.0, 12.0, 3.0, 5.0, 2.0 }, // { 0.5, 1.0, 2.0, 34.0 }, 
                           { 71.5, 13.5, 26.4, 11.6, 20.0 }, // { 0.66, 2.0, 3.0, 22.0 }, 
                           { 358.0, 48.0, 63.0, 147.0, 100.0 }, // { 0.75, 3.0, 4.0, 13.0 }, 
                           { 49.6, 23.0, 9.0, 7.6, 10.0 }, // { 0.8, 4.0, 5.0, 71.3 },
              });}
       @Parameter(value = 0) public Double first;
       @Parameter(value = 1) public Double second;
       @Parameter(value = 2) public Double third;
       @Parameter(value = 3) public Double fourth;
       @Parameter(value = 4) public Double expected;
       
       @Test
       public void subtract() {
    	      System.out.println(first + " - " + second + " - " + third + " - " + fourth + " = " + expected);
              assertEquals("Not correct", Calculator.subtract(first, second, third, fourth), expected, 0.09);
}}