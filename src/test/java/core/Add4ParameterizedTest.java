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
	public class Add4ParameterizedTest {
       @Parameters(name = "Parameter # {index}: {0} + {1} + {2} + {3} = {4}")
       public static Collection<Double[]> addNumbers() {
            return Arrays.asList(new Double[][] {
                           { 13.0, 22.0, 12.0, 3.0, 50.0 },  
                           { 0.6, 71.5, 13.5, 26.4, 112.0 }, 
                           { 1.0, 358.0, 48.0, 63.0, 470.0 },  
                           { 1.4, 49.6, 23.0, 9.0, 83.0 }, 
              });}
       @Parameter(value = 0) public Double first;
       @Parameter(value = 1) public Double second;
       @Parameter(value = 2) public Double third;
       @Parameter(value = 3) public Double fourth;
       @Parameter(value = 4) public Double expected;
       
       @Test
       public void add() {
    	      System.out.println(first + " + " + second + " + " + third + " + " + fourth + " = " + expected);
              assertEquals("Not correct", Calculator.add(first, second, third, fourth), expected, 0.09);
}}