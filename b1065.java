public class b1065 {

    int n=0;


    void finder(int x) {

        n=0;

        for (int i = 1; i <= x; i++) {
            int a = (i / 100);
            int b = (i % 100) / 10;
            int c = (i % 10);
            int d = b - a;
            int e = c - b;

            if (i < 100) {
                n++;
            } else if (d == e) {
                n++;
            }
        }
        System.out.printf("%d\n",n);
    }



}
