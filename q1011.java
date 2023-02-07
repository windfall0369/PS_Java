import java.util.Scanner;

public class q1011 {

    public int[] Xsolution(String s,char c) {
        int[] Xanswer = new int[s.length()];

        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }

            Xanswer[i] = p;
        }

        p = 1000;
        for (int j = 0; j < s.length(); j++) {
            int sch = (s.length()-1-j);
            if (s.charAt(sch) == c) {
                p = 0;
            } else {
                p++;
                Xanswer[sch]=Math.min(Xanswer[sch],p);
            }
        }
        return Xanswer;
    }


    public static void main(String[] args) {

        q1011 X = new q1011();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char cha = kb.next().charAt(0);
        for(int i : X.Xsolution(str,cha)){
            System.out.print(i+" ");
        }



    }

}
