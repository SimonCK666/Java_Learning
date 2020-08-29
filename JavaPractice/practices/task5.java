/**
* task5.java
* @author bulbasaur
* @description 

 将This is a test倒着输出tset a si sihT （用StringBuffer）

* @created 2020-08-12T19:36:48.061Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T19:41:28.690Z+08:00
*/

// public class task5 {
//     public static void main(String[] args) {
//         String str = "this is a man";
//         StringBuffer sb = new StringBuffer(str.length());
        
//         for (int i = sb.length() - 1; i >= 0; i--) {
//             sb.append(str.charAt(i));
//         }

//         System.out.println(sb);
//     }
// }

public class task5 {
    public static void main(String[] args) {
        String str = "this is a man";
		StringBuffer sb = new StringBuffer(str.length());
		for (int j = str.length() - 1; j >= 0; j--) {
			sb.append(str.charAt(j));
		}
		System.out.print(sb);

    }
}