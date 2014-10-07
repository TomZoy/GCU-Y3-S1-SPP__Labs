/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author Richard Foley
 */
public class Palindrome {
    public boolean isPalindrome(int num){
        int temp = num;
        int rem;
        int result=0;
        while (temp != 0){
          rem=temp%10;
          temp=temp/10;
          result=result*10+rem;
        }
        if (num==result)
            return true;
        else
            return false;
    }

}
