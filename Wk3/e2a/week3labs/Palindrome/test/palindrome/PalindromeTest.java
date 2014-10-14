/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import junit.framework.TestCase;

/**
 *
 * @author TomZoy
 */
public class PalindromeTest extends TestCase {
    
    public PalindromeTest(String testName) {
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
     * Test of isPalindrome method, of class Palindrome.
     */
    public void testIsPalindrome() {


        
        Palindrome instance = new Palindrome();
        
        int num[] = {121,1,123,555,456,464,1236321,8789};
        boolean expResult[] = {true,true,false,true,false,true,true,false};
        
        for (int i=0;i<(expResult.length);i++)
        {
 
        boolean result = instance.isPalindrome(num[i]);
        assertEquals("error"+num[i],expResult[i], result);
        }

    }
    
}
