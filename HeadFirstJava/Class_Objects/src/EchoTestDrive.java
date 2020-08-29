/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/26 10:36
 */
public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();   // <--> Echo e1 = e2;
        int x = 0;
        while( x < 4) {
            e1.hello();
            e1.count += 1;
            if (x == 3) {
                e2.count += 1;
            }
            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x += 1;
        }  // while end
        System.out.println(e2.count);
    }  // main end
}  // class end

class Echo {
    int count = 0;

    void hello() {
        System.out.println("heloooo...");
    }
}