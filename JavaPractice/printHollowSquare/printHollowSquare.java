package printHollowSquare;

public class printHollowSquare {
    public static void main(String[] args) {
        printHollowSquare();
    }
    public static void printHollowSquare() {
        for (int i = 0; i <10; i++) {
			if(i==0 || i==9) {
				for (int j = 0; j < 10; j++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for (int j = 0; j < 8; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

    }
}