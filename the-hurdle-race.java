import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
       Scanner sc = new Scanner(System.in);
       int n,k;
       n = sc.nextInt();
       k = sc.nextInt();
       int[] myarray = new int[n];
       for(int i=0; i<n; i++)
       {
           myarray[i] = sc.nextInt();
       }
       
       Arrays.sort(myarray);
       int maximum = myarray[n-1];
       if(k>=maximum)
       {
           System.out.println("0");
       }
       else
       {
           System.out.println(maximum-k);
       }
       
    }
}
