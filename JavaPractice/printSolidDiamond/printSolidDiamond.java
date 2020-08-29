package printSolidDiamond;

public class printSolidDiamond {
    public static void main(String[] args) {
        printSolidDiamond();
    }
    
    public static void printSolidDiamond() {
        int n = 9;
        System.out.println("Solid Diamond: ");
        // Up part
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < (n - (2 * i +1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - (2 * i + 1)) / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        // up cut line
        System.out.println();

        // Middle part
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // middle cut line
        System.out.println();

        // Down part
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n - (i + 1) * 2); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}