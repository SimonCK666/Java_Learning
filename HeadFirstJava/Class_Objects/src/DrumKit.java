/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/26 10:21
 */
public class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        // why do we need this statement?
        if (d.snare == true) {
            d.playSnare();
        }  // end if
    }  // end main
}  // end class