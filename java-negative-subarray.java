import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<n; i++)
        {
            int sum=arr[i];
            for(int j=i+1;j<n+1;j++)
            {
                if(sum<0)
                {
                    count++;
                }
                if(j!=n)
                    sum+=arr[j];
            }
        }
        System.out.println(count);
    }
}
