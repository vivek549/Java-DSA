/* Find kth smallest element in unsorted list */

import java.util.*;
public class FindKthSmallest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();       // number of elements in array
        
        int arr[] = new int[n];  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }
        
        int k = sc.nextInt();       // kth element
        sc.close();
        
        Arrays.sort(arr);
        System.out.println("\n" + arr[k-1]);
    }
}