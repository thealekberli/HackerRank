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
       int x1,v1,x2,v2;
       x1 = sc.nextInt();
       v1 = sc.nextInt();
       x2 = sc.nextInt();
       v2 = sc.nextInt();
       double k = (double)(x1-x2)/(v2-v1);
       if(k<1 || k != (int)k)
       {
           System.out.println("NO");
       }
       else
       {
           System.out.println("YES");
       }
       
    }
}
