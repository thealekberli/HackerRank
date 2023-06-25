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
     int n = sc.nextInt();
     int i,k;
     int count=0;
     List<Integer> integerList = new ArrayList<>();
     for(i=0;i<n;i++)
     {
         k = sc.nextInt();
         integerList.add(k);
     }
     
     Collections.sort(integerList);
     
     int maximum = integerList.get(n-1);
     
     for(i=0;i<n;i++)
     {
         if(maximum == integerList.get(i))
         {
             count++;
         }
     }
     System.out.println(count);
    }   
}
