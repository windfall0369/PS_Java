import java.util.Scanner;

public class b2675 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();



        for(int i=0;i<a;i++){
            int prt = s.nextInt();
            String word = s.next();

            for(int j =0;j<word.length();j++){
                for(int k=0;k<prt;k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }

}
