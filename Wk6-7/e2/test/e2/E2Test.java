/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2;

import triangle.Triangle;
import junit.framework.*;
import java.util.*;




/**
 *
 * @author TomZoy
 */
public class E2Test extends TestCase {
    

    public void testConst1() {

           Triangle testT1 = new Triangle(5, 4, 3);
           
           assertEquals("Constructor1 test falied",5,testT1.getSideA());
           assertEquals("Constructor1 test falied",4,testT1.getSideB());
           assertEquals("Constructor1 test falied",3,testT1.getSideC());
    }
    
        public void testConst2() {
        
        Triangle testT2 = new Triangle(5, 4, 3);
        
        Triangle testT3 = new Triangle(testT2);
        
           assertEquals("Constructor2 test falied",5,testT3.getSideA());
           assertEquals("Constructor2 test falied",4,testT3.getSideB());
           assertEquals("Constructor2 test falied",3,testT3.getSideC());
        }
        
        public void testIsTriangle() {
            
           int a[]={5,5,1,5,11,5,-5,5};
           int b[]={4,5,6,20,2,5,0,5};
           int c[]={2,5,10,1,3,10,2,9};
           boolean IT[]={true,true,false,false,false,false,false,true};
            
           ArrayList T0 = new ArrayList();
           
           for(int i=0;i<a.length;i++)
           {
               T0.add(helper(a[i], b[i], c[i]));
           }
           
           for(int i=0;i<a.length;i++)
           {
            Triangle test = new Triangle((Triangle)T0.get(i));
            assertEquals("isTriangle method test FAILED! inst: "+i,IT[i],test.isTriangle());
           }
           
        }        
        
        public void testIsEqu() {
            
           int a[]={1,5,1,1,1,-5};
           int b[]={1,1,5,1,10,1};
           int c[]={1,1,1,5,2,1};
           boolean IT[]={true,false,false,false,false,false};
            
           ArrayList T0 = new ArrayList();
           
           for(int i=0;i<a.length;i++)
           {
               T0.add(helper(a[i], b[i], c[i]));
           }
           
           for(int i=0;i<a.length;i++)
           {
            Triangle test = new Triangle((Triangle)T0.get(i));
            assertEquals("isEquilateral method test FAILED! when i="+i,IT[i],test.isEquilateral());
           }
           
        }
        
        
          public void testIsIso() {
            
           int a[]={1,5,8,5,3,10};
           int b[]={1,5,5,8,2,1};
           int c[]={1,8,5,5,5,2};
           boolean IT[]={true,true,true,true,false,false};
            
           ArrayList T0 = new ArrayList();
           
           for(int i=0;i<a.length;i++)
           {
               T0.add(helper(a[i], b[i], c[i]));
           }
           
           for(int i=0;i<a.length;i++)
           {
            Triangle test = new Triangle((Triangle)T0.get(i));
            assertEquals("isIsosceles method test FAILED! when i="+i+". ",IT[i],test.isIsosceles());
           }
           
        }
        
        
        
           public void testIsRight() {
            
           int a[]={3,1,-1};
           int b[]={4,1,3};
           int c[]={5,1,4};
           boolean IT[]={true,false,false};
            
           ArrayList T0 = new ArrayList();
           
           for(int i=0;i<a.length;i++)
           {
               T0.add(helper(a[i], b[i], c[i]));
           }
           
           for(int i=0;i<a.length;i++)
           {
            Triangle test = new Triangle((Triangle)T0.get(i));
            assertEquals("isRightAngled method test FAILED! when i="+i+". ",IT[i],test.isRightAngled());
           }
           
        }
        
        
        
        
        
        
        
        public Triangle helper(int a, int b, int c) {
        
            Triangle testT0 = new Triangle(a, b, c);
            return testT0;
        }
        
    
    
}
