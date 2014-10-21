/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesorttest;

import junit.framework.*;
import bubblesort.BubbleSort;
/**
 *
 * @author TomZoy
 */
public class BubbleSortTestTest extends TestCase {
    

    public void testSort() {
        BubbleSort testInstance = new BubbleSort();
        int values [] = {5,2,9,4,1,3};
        int expected[] = {1,2,3,4,5,9};
        int actual[] = testInstance.sort(values);
        
        for(int i=0; i<values.length; i++)
        {
            assertEquals("Testing Sort",expected[i],actual[i]);
        }
        
    }
    
}
