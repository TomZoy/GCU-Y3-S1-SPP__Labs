/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findlowest;

import junit.framework.TestCase;

/**
 *
 * @author TomZoy
 */
public class FindLowestTest extends TestCase {
    
    public FindLowestTest(String testName) {
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
     * Test of findLowest method, of class FindLowest.
     */
    public void testFindLowest() {
        System.out.println("findLowest");
        FindLowest instance = new FindLowest();
        
        
        
        
        int[][] values = {{1,2,3,4,5,6,-99},{9,8,7,6,5,4,-99},{-99,5,4,7,8,9,8,-99},{-77,1,2,5,4,7,-99},{-150,12,54,7,89,2,-99}};

        int[] expResult = {1,4,-99,-77,-150};
                
                
        for(int i=0; i< expResult.length; i++)
        {    
            int result = instance.findLowest(values[i]);
            assertEquals("test"+i+" failed",expResult[i], result);
        }
    }
    
}
