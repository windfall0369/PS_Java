import java.util.Scanner;

public class b2480 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int sum = 0;
        int x = 0;

        if (a >= b) {
            x = a;
            if (x >= c) {
                x = a;
            } else {
                x = c;
            }
        } else if (a <= b) {
            x = b;
            if (x >= c) {
                x = b;
            } else {
                x = c;
            }
        }

        if (a == b && b == c) {
            sum += 10000 + (a * 1000);
        } else if (a == b || a == c) {
            sum = 1000 + (a * 100);
        } else if (b == a || b == c) {
            sum = 1000 + (b * 100);
        } else if (c == a || c == b) {
            sum = 1000 + (c * 100);
        } else {
            sum = x * 100;
        }

        System.out.println(sum);
    }
}
