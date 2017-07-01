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
public class BetterEnumeration {
    
    public static int max_sum(int[] arr){
        int N = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = i; j < N; j++)
            {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;    
    }
  
}
