/**
* task2.java
* @author bulbasaur
* @description 
 不使用中间变量交换两数
* @created 2020-08-11T16:56:23.614Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T16:05:53.375Z+08:00
*/




public class task2 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int mulit = a * b;
        
        int _a = mulit / a;
        int _b = mulit / b;
        
        System.out.println("a: " + _a + " b: " + _b);
    }
}
