import java.util.ArrayList;
import java.util.Arrays;

public class q3002 {
    public ArrayList<Integer> q3002(int n, int m, int[]a, int []b) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0;
        int p2=0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (p1 < n && p2 < m) {
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1]<b[p2]){
                p1++;
            }else {
                p2++;
            }
        }


        return answer;
    }

}
