/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortlist;


import junit.framework.TestCase;
import junit.framework.Assert;
/**
 *
 * @author TomZoy
 */
public class SortListTest extends TestCase {
    
    public SortListTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of sort method, of class SortList.
     */
    public void testSort() {
        System.out.println("sort");
                SortList instance = new SortList();
                
                
                
                
        int[][] values = {{9,8,7,6,5,4,3,2,1},{1,2,3,4,5,6,7,8,9}};
        

        int[][] expResult = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
       

        
        for (int i=0; i<2;i++)
        {
        
        

        
        for (int j=0; j< expResult[i].length; j++)
        {
             int [] result = instance.sort(values[i], expResult[i].length);
             assertEquals("dsf",expResult[i][j], result[j]);
        }
        
        }
    }
    
}
