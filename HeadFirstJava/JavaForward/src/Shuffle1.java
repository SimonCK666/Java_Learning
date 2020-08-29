/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/20 9:55
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;

        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x -= 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x -= 1;
            }
//            x -= 1;
//            System.out.print("-");
        }

    }
}
