/**
* task8.java
* @author bulbasaur
* @description 

    求0-7所能组成的奇数个数。
    
    提示：
    //组成1位数是4个。
    //组成2位数是7*4个。
    //组成3位数是7*8*4个。
    //组成4位数是7*8*8*4个。

* @created 2020-08-12T20:17:32.170Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T20:29:07.267Z+08:00
*/


public class task8 {
    public static void main(String[] args) {
        int sum = 4;
        System.out.println("Single digists: " + sum);
        sum = sum * 7;
        System.out.println("Ten digists: " + sum);

        int ALL = sum + 4;
        
        for ( int i = 3; i < 10; i++) {
            sum *= 8;
            System.out.println(i + " digists: " + sum);
            ALL = ALL + sum;
        }
        
        System.out.println("All: " + ALL);
    }
}