/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccitest;
import fibonacci.Fibonacci;

import junit.framework.*;

/**
 *
 * @author TomZoy
 */
public class FibonacciTestTest extends TestCase {
    

    /**
     * Test of main method, of class FibonacciTest.
     */
    public void testMain() {

        Fibonacci tester = new Fibonacci();
        
        int input[]= {-5,-1,0,1,2,3,4,8,9,10};
        int expected[] = {-1,-1,-1,1,1,2,3,21,34,55};
        
        int actual;
        
        for(int i=0;i<input.length;i++)
        {
            actual= tester.compute(input[i]);
            
            assertEquals("test failed on "+i+" test !",expected[i],actual);

        
        }
        
        
        
    }
    
}
