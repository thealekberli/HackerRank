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
        long[] arr = new long[5];
        long sum=0;
        for(int i = 0; i<5; i++)
        {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println((sum-arr[4])+" "+(sum-arr[0]));
        
        
    }
}
