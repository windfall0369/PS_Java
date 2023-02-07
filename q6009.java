import java.util.Arrays;

public class q6009 {


    public int count(int[] arr, int capacity) {
        int cnt=1;
        int sum=0;

        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else {
                sum+=x;
            }
        }
        return cnt;

    }

    public int q6009(int n,int m, int [] arr) {
        int answer=0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }
            else {
                lt=mid+1;
            }
        }

        return answer;
    }

}
