import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int l1 = a.length();
        int l2 = b.length();
        char[] arr1 = new char[l1];
        char[] arr2 = new char[l2];
        arr1 = a.toCharArray();
        arr2= b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Boolean flag = true;
        if(l1!=l2)
            flag = false;
        else {
            for (int i = 0; i < l1; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                    break;
                }
            }
        }
        String result = (flag) ? "Anagrams" : "Not Anagrams";
        System.out.println(result);
    }
}
