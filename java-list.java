import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Integer> list = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++)
        {
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();
        for(int i=0; i<x; i++)
        {
            String a = sc.next();
            if(a.equals("Insert"))
                list.add(sc.nextInt(), sc.nextInt());
            else
                list.remove(sc.nextInt());
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
