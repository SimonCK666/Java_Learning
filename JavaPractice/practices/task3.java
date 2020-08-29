/**
* task3.java
* @author bulbasaur
* @description 

 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
 因为153=1的三次方＋5的三次方＋3的三次方。

* @created 2020-08-12T15:56:52.376Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T16:05:15.388Z+08:00
*/



public class task3 {
    public static void main(String[] args) {
        int m1, m2, m3;
        for (int m = 101; m < 1000; m++) {
            m3 = m / 100;
            m2 = m % 100 / 10;
            m1 = m % 10;
            
            if (m1 * m1 * m1 + m2 * m2 * m2 + m3 * m3 * m3  == m) {
                System.out.println(m + " is a Daffodil number!");
            }
        }
    }
}