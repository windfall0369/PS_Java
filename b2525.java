import java.util.Scanner;

public class b2525 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int A = sn.nextInt();
        int B = sn.nextInt();

        int C = sn.nextInt();

        int min = 60 * A + B;
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}

