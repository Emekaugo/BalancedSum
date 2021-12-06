/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedsum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedSum {
     
    static String FindMiddleElement(int arr[], int n)
    {
        
        // get left sum array from 0
        int[] leftSum = new int[n];
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            leftSum[i] = leftSum[i - 1] + arr[i];
      
        // get right sum array from n-1
        int[] rightSum = new int[n];
        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightSum[i] = rightSum[i + 1] + arr[i];
      
        // Find the point where prefix and suffix
        // sums are same.
        for (int i = 1; i < n - 1; i++)
            if (leftSum[i] == rightSum[i])
            {
//                return arr[i];  
                return "YES";
            }
        
      
//        return -1;
        return "NO";
    }
    
    public static void main(String[] args) {
        
         int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
       
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in an array:"+sum);
        System.out.println(FindMiddleElement(arr, n));
        
        
    }
    
}
