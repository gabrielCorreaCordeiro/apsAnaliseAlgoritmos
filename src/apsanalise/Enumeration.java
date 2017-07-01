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
public class Enumeration {
    static int forEnumeratioin(int[] vect){
       int soma = 0;
       int aux =0;
                for(int i=0;i<vect.length;i++){
                  
                    for(int j=vect.length-1;j>i;j--){
                        aux = som(vect,i,j);
                        if(soma < aux ){
                                soma = aux;
                        }
                    
                    }
                }
    
    return soma;
    }
    
    
    private static int som(int[] vect, int i, int j){
        int soma =0;
        for(;i<=j;i++){
            soma+=vect[i];
        
        }
    
       return soma;
    }
}
