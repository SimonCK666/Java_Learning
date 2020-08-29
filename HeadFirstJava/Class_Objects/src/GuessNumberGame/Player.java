package GuessNumberGame;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/25 17:37
 */
public class Player {
    // 要被猜的数字
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing" + number);
    }
}
