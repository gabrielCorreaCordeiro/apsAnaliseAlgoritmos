/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apsanalise;

/**
 *
 * @author gabriel
 */
public class DynamicPrograming {
    
      public static int getMaxSubArray(int[] A) {
        int novaSoma=A[0];
        int maiorSoma=A[0];
                for(int i=1;i<A.length;i++){
                        if(novaSoma+A[i] > A[i])
                            novaSoma+=A[i];
                        else
                            novaSoma = A[i];
                        if(novaSoma>maiorSoma)
                            maiorSoma = novaSoma;
                }
        
        
        return maiorSoma;
      }
    
}
