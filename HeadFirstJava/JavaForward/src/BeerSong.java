/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/20 9:39
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 10;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall.");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

//            beerNum = beerNum - 1;
            beerNum -= 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end with else
        } // end with while
    } // end with main function
} // end with class
