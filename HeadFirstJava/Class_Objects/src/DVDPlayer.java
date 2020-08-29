/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/26 10:14
 */
public class DVDPlayer {
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }

    void playDVD() {
        System.out.println("DVD playing");
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }  // if end
    }  // main end
}  // class end