import java.util.Arrays;

public class q6006 {

    public int[] q6006(int n, int [] arr) {
        int [] answer = new int[2];

        int [] tmp = arr.clone();

        Arrays.sort(arr);
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(tmp[i]!=arr[i]){
                answer[cnt++]=i+1;
            }
        }




        return answer;
    }

}
