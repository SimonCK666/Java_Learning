import java.util.Scanner;

/**
* task4.java
* @author bulbasaur
* @description 

 计算字符串中子串出现的次数。
 首先在控制台输入一个字符串
 然后在控制台输入子串
 计算子串出现的次数

* @created 2020-08-12T17:34:59.087Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T19:16:01.282Z+08:00
*/

import java.util.*;

public class task4_ND {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a Letter: ");
        String str1 = s.nextLine();
        
        System.out.println("Please input a String: ");
        String str2 = s.nextLine();
        
        int count = 0;
        if (str1.equals("") || str2.equals("")) {
            System.out.println("If you do not input a letter or a strng, it will not compare.");
            System.exit(0);
        } else {
            for (int i = 0; i < str1.length() - str2.length(); i++) {
                if (str2.equals(str1.substring(i, str2.length() + i))) {
                    
                    count++;
                }
            }
            System.out.println("Letter is showing up in string: " + count + " times.");
        }
    } 
}