import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map <String,String> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            String name = sc.nextLine();
            String phone = sc.nextLine();
            map.put(name, phone);
        }
        while(sc.hasNextLine())
        {
            String a = sc.nextLine();
            if(map.containsKey(a))
            {
                System.out.println(a+"="+map.get(a));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
