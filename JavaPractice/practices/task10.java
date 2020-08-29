/**
* task10.java
* @author bulbasaur
* @description 
* @created 2020-08-12T20:45:41.508Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T20:48:21.098Z+08:00
*/


public class task10 {
    public static void main(String[] args) {
        System.out.println("Answer: ");
        for (int i = 1; i < 1000; i++) {
            int t = 0;
            for (int j = 1; j < i / 2; j++) {
                if (i % j == 0) {
                    t = t + j;   
                }
            }
            
            if (t == i) {
                System.out.println(i + "     ");
            }
        }
    }
}