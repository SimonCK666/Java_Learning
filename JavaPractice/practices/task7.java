
/**
* task7.java
* @author bulbasaur
* @description 

 判断1-100之间有多少个素数，并输出所有素数。

* @created 2020-08-12T19:59:02.557Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T20:17:56.242Z+08:00
*/


public class task7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime == true) {
                count++;
                System.out.print(i + " ");
                if (count % 5 == 0) {
                    System.out.println(" ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("The number of Prime number is : " + count);
    }
}