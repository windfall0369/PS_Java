import java.util.Arrays;

public class q6008 {

    public int q6008(int n,int m, int [] arr) {
        int answer=0;
        Arrays.sort(arr);

        int lt=0;
        int rt=n-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            if(arr[mid]>m){
                rt=mid-1;
            }else {
                lt=mid+1;
            }
        }


        return answer;
    }

}
