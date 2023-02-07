import java.util.Scanner;

public class b2438 {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);

        int n = b.nextInt();

        for (int i = 0; i < n; i++) {

            for (int x = n - i - 1; x > 0; x--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }

}
