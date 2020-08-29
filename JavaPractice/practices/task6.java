import java.util.Scanner;

/**
* task6.java
* @author bulbasaur
* @description 

 从控制台输入3个数，按大小顺序输出。

* @created 2020-08-12T19:41:07.867Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T19:59:21.842Z+08:00
*/


public class task6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please input three numbers: ");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        if (a < b) {
            int t = 0;
            t = a;
            a = b;
            b = t;
        }

        if (a < c) {
            int t = 0;
            t = a;
            a = c;
            c = t;
        }

        
        if (b < c) {
            int t = 0;
            t = b;
            b = c;
            c = t;
        }

        

        System.out.print("Output in decending order: ");
        System.out.println(a + " " + b + " " + c);

    //     Scanner s = new Scanner(System.in);
	// 	System.out.println("请输入3个整数：");
	// 	int a = s.nextInt();
	// 	int b = s.nextInt();
	// 	int c = s.nextInt();
	// 	if (a < b) {
	// 		int t = a;
	// 		a = b;
	// 		b = t;
	// 	}
	// 	if (a < c) {
	// 		int t = a;
	// 		a = c;
	// 		c = t;
	// 	}
	// 	if (b < c) {
	// 		int t = b;
	// 		b = c;
	// 		c = t;
	// 	}
	// 	System.out.println("从大到小的顺序输出:");
	// 	System.out.println(a + " " + b + " " + c);
	}

}
