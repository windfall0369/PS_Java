import java.util.Scanner;

public class b8958 {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        String arr[] = new String[n];



        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for (int i = 0; i < n; i++) {

            int cnt = 0;
            int sum = 0;

            for (int j = 0; j <n; j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }


    }

}
