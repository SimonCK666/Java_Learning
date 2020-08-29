/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/26 10:06
 */
public class TapeDeck {

    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {   //  <-->  if (t.canRecord == true)
            t.recordTape();
        }  // if end
    }  // main end
}  // class end