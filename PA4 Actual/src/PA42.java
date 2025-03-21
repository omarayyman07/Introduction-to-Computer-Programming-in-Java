import java.util.Scanner;

    public class PA42 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Get an odd integer from the user
            System.out.print("Enter an odd number: ");
            int n = sc.nextInt();

            // Ensure the input is odd
            if (n % 2 == 0) {
                System.out.println("Please enter an odd number.");
            } else {
                int spaces = n / 2; // Calculate initial spaces for centering

                // Loop through the rows (odd numbers only)
                for (int i = 1; i <= n; i += 2) {
                    // Print leading spaces
                    for (int s = 0; s < spaces; s++) {
                        System.out.print(" ");
                    }

                    // Print numbers from 1 to i
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }

                    System.out.println(); // Move to the next line
                    spaces--; // Reduce spaces for centering in next row
                }
            }
        }}



