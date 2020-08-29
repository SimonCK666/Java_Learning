package printSolidSquare;

public class printSolidSquare {
    public static void main(String[] args) {
        printSolidSquare();
    }

    public static void printSolidSquare() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}