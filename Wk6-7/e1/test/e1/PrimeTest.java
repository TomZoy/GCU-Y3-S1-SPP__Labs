/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import junit.framework.*;
import prime.Prime;

/**
 *
 * @author TomZoy
 */



public class PrimeTest extends TestCase {
    
    

    
    
    
    public void testPrime_constr1() {
        
        Prime test1 = new Prime();
        assertEquals("testing def. constrctor failed",0,test1.getValue());    
    }

    public void testPrime_constr2() {
        
        Prime test2 = new Prime(10);
        
        assertEquals("testing constrctor 2 failed",10,test2.getValue());
        
        int i = 20;
        test2.setValue(i);


        assertEquals("testing constrctor 2 failed",i,test2.getValue()); 

    }
    
    public void testPrime_evenFilter() {
    
    Prime test3 = new Prime(0);
    
    for (int i=4;i<10001;i=i+2)
    {
        test3.setValue(i);
        assertEquals("testing for even Number failed",false,test3.isPrime()); 
    }
    
    }
    
    public void testPrime_normal() {
    
    Prime test4 = new Prime(0);
    
    int i[]= {-50,-1,0,1,2,3,4,5,6,7,8,9,10,22,45,63,28};
    boolean expe[]={false,false,false,false,true,true,false,true,false,true,false,false,false,false,false,false};
    
    for(int j=0;j<i.length-1;j++)
    {
        test4.setValue(i[j]);
        assertEquals("Normal test failed! number: "+i[j],expe[j],test4.isPrime()); 
    }
    
    
    }
    

}