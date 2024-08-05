import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[101];

        System.out.println("Enter numbers between 1 and 100 (0 to stop):");

        while (true) {
            int number = input.nextInt();
            if (number == 0) break; // Exit on 0
            if (number >= 1 && number <= 100) counts[number]++;
        }

        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d occurs %d time%s%n", i, counts[i], counts[i] > 1 ? "s" : "");
            }
        }

        input.close();
    }
}