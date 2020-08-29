/**
* task9.java
* @author bulbasaur
* @description 

一球从100米高度自由落下，每次落地后反跳回原高度的一半；
再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？ 

* @created 2020-08-12T20:31:00.898Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T20:43:56.714Z+08:00
*/


public class task9 {
    public static void main(String[] args) {
        double high = 100;
        double way = 100;
        for (int i = 1; i < 11; i++) {
            high /= 2;
            way = way + high;
        }

        System.out.println("High: " + high);
        System.out.println("Way: " + way);
    }
}