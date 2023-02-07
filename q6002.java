import java.util.ArrayList;

public class q6002 {

    //bubble sort
    public ArrayList<Integer> q6002(int n,  int [] arr) {
        ArrayList<Integer> answer= new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            answer.add(arr[i]);
        }



        return answer;
    }



}
