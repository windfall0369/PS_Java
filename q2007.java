public class q2007 {
    public int q2007(int n, int[] arr) {
        int answer = 0;
        int cnt =0;
        int sum=0;

        int score =0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                sum= sum + cnt;
            }
            else{
                cnt =0;
            }
        }
        answer = sum;


        return answer;
    }

}
