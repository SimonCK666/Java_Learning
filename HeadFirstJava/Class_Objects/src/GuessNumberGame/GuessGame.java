package GuessNumberGame;

/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/24 10:58
 */
public class GuessGame {
    // 三个实例变量表示三个Player对象
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // 创建出三个对象
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // 声明三个变量来保存是否猜中
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // 声明三个变量来保存猜测的数字
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // 产生谜底数字
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // 调用 Player 的 guess() 方法
            p1.guess();
            p2.guess();
            p3.guess();

            // 取得每个 Players 所猜测的数字，并列出
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // 检查是否猜中，若猜中则去设定是否猜中的变量
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // 如果有一或多个猜中... (|| 或)
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a Winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);

                System.out.println("Game is over.");
                break; // 游戏结束，终止循环

            } else {
                // 都没有猜中，所以需要继续下去
                System.out.println("Players will have to try again.");
            } // is/else end
        }  // while loop end
    }  // function end
}  // class end
