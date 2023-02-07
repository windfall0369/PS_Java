public class q3003 {

    public int q3003(int n, int k, int[]a) {
        int answer=0;
        int sum=0;

        for(int i=0;i<k;i++){
            sum +=a[i];
        }
        answer=sum;


        for(int i=k;i<n;i++){
            sum+=(a[i]-a[i-k]);
            answer= Math.max(sum,answer);
        }



        return answer;
    }
}
