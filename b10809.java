import java.util.Scanner;

public class b10809 {
    public static void b10809() {
        Scanner A = new Scanner(System.in);

        String name = A.nextLine();

        int[] names = new int[name.length()];

        int n = 0;

        for (int q = 0; q < 26; q++) {
            int x = 0;
            for (int j = 0; j < name.length(); j++) {
                if (q == name.charAt(j) - 97) {
                    x = 1;
                    System.out.printf("%d ", j);
                    break;
                }
            }
            if (x != 1) {
                System.out.printf("%d ", -1);
            }
        }
    }
}
