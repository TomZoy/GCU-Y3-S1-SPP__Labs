/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialtest;

import junit.framework.*;
import factorial.Factorial;

/**
 *
 * @author TomZoy
 */
public class FactorialTestTest extends TestCase {

    public void testFactorial() {
        
      Factorial tester = new Factorial();
      
      int input[] = {1,5,6,9,8,10};
      int expected[] = {1,120,720,362880,40320,3628800};
      
      int actual;
      
      for (int i=0;i<input.length;i++)
      {
          actual=tester.compute(input[i]);
          assertEquals("Testing instance "+i+" faliled",expected[i],actual);
      }
        

    }
    
}
