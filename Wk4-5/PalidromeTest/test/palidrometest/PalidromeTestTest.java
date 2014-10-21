/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palidrometest;

import junit.framework.*;
import stringpalindrome.StringPalindrome;

/**
 *
 * @author TomZoy
 */
public class PalidromeTestTest extends TestCase {
    
 
    public void testMain() {

        StringPalindrome tester = new StringPalindrome();
        
        String input[] = {"alma","ala","alabama","asdkdsa"};
        boolean expected[]={false,true,false,true};
        boolean actual;
        
        
        for(int i=0;i<input.length;i++)
        {
            actual = tester.isPalindrome(input[i]);
            
            assertEquals("Testing on test "+i+" falied",expected[i],actual);
        
        }
        
        
        
    }
    
}
