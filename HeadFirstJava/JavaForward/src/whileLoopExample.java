/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/20 9:25
 */
public class whileLoopExample {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the Loop");
            System.out.println("Value of x is " + x);
//            x = x + 1;
            x += 1;
        }
        System.out.println("This is after Loop.");
    }
}
