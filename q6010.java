import java.util.Arrays;

public class q6010 {

    public int count(int [] arr,int dis) {
        int cnt=1;
        int ep=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-ep>=dis){
                cnt++;
                ep=arr[i];
            }
        }


        return cnt;

    }

    public int q6010(int n,int c, int [] arr) {
        int answer=0;
        Arrays.sort(arr);

        int lt=1;
        int rt=arr[n-1];

        while(lt<=rt){
            int mid= (lt+rt)/2;
            if(count(arr,mid)>=c){
                answer=mid;
                lt=mid+1;
            }else {
                rt=mid-1;
            }

        }




        return answer;
    }

}
