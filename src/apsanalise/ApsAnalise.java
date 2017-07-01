/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apsanalise;

import java.util.Random;

/**
 *
 * @author gabriel
 */
public class ApsAnalise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vect[] = new int[1000];
     
        
        Random r = new Random();
        r.setSeed(1);
        
        for (int i = 0; i < vect.length; i++) {
            vect[i] = r.nextInt();
        }

       
       
       long timeB = System.nanoTime();
       
   
            //Enumeration.forEnumeratioin(vect);
            DivisionAndConquer.maxSubArray(vect);
       
       long timeAf = System.nanoTime();
       
        System.out.println(timeAf - timeB);
       
    }
    
}
