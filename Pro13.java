public class Pro13 {
    public static void main(String[] args) {
        // break statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // terminates the loop when i equals 3
            }
            System.out.println("Break: " + i);
        }

        // continue statement
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;  // skips the current iteration when j equals 3
            }
            System.out.println("Continue: " + j);
        }

        // labeled statement with break
        outerLoop: for (int x = 1; x <= 3; x++) {
            innerLoop: for (int y = 0; y <= 2; y++) {
                if (y == 2) {
                    break outerLoop;  // terminates both loops when y equals 2
                }
                System.out.println("Labeled Break: " + x + " " + y);
            }
        }
}}
