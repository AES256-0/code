import java.util.Arrays; 
import java.util.Collections; 
  
// Java code to find sum of  
// maximum of all subsets of array 
class GFG  
{ 
  
    // Method returns sum of maximum of all subsets 
    static int sumOfMaximumOfSubsets(Integer arr[], int N)  
    { 
        // sorting array in decreasing order 
        Arrays.sort(arr, Collections.reverseOrder()); 
  
        // initializing sum with first element 
        int sum = arr[0]; 
        for (int i = 1; i < N; i++) 
        { 
            // calculating evaluation similar to horner's rule 
            sum = 2 * sum + arr[i]; 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        Integer arr[] = {0,1,2,3,4,5,6,7,8,9}; 
        int N = arr.length; 
        System.out.println(sumOfMaximumOfSubsets(arr, N)); 
    } 
} 
