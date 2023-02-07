import java.util.ArrayList;

public class q6001 {

    //selection sort
    public ArrayList<Integer> q6001(int n,  int [] arr) {
        ArrayList<Integer> answer= new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            int idx=i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[idx]){
                    idx=j;
                }
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            answer.add(arr[i]);
        }


        return answer;
    }

}
