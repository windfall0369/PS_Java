import java.util.Scanner;

public class b10871 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        int n = m.nextInt();
        int[] array = new int[n];
        int x = m.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = m.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (array[i] < x) {
                System.out.println(array[i]);
            }
        }

    }

}
