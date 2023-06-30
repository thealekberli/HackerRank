import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int size = n.length();
        char[] arr = new char[size];
        arr = n.toCharArray();
        Boolean flag = true;
        for(int i=0;i<size/2;i++)
        {
            if(arr[i]!=arr[size-i-1])
            {
                flag = false;
                break;
            }
        }
        String result = (flag) ? "Yes" : "No";
        System.out.println(result);
    }
}
