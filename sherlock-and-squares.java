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
       int q,a,b;
       q = sc.nextInt();
       int[] result = new int[q];
       for(int i=0; i<q; i++)
       {
           a = sc.nextInt();
           b = sc.nextInt();
           int x1 = (int)Math.ceil(Math.sqrt(a));
           int x2 = (int)Math.floor(Math.sqrt(b));
           result[i] = x2-x1+1;
       }
        
        for(int i=0; i<q; i++)
        {
            System.out.println(result[i]);
        }
    
    }
}
