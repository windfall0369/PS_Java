import java.util.ArrayList;

public class q2008 {


    public ArrayList<Integer> q2008(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();


        for(int i=0;i<n;i++){
            int cnt =1;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    cnt++;
                }

            }
            answer.add(cnt);
        }

        return answer;
    }

}
