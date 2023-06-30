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
        double n = sc.nextDouble();
        int zeros = 0;
        int negative = 0;
        int positive = 0;
        for(int i = 0; i<n; i++)
        {
           int tmp = sc.nextInt();
           if(tmp>0)
               positive++;
           else if(tmp==0)
               zeros++;
           else
               negative++;
        }   
        
        double tmp1 = (positive/n);
        System.out.printf("%.6f\n",tmp1);
        
        double tmp2 = (negative/n);
        System.out.printf("%.6f\n",tmp2);
    
        double tmp3 = (zeros/n);
        System.out.printf("%.6f",tmp3);
    }
}
