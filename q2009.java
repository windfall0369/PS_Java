public class q2009 {
    public int q2009(int n, int[][] arr) {
        int answer = 0;
        int crs1 =0;
        int crs2=0;
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++){

            crs1 += arr[i][i];
            crs2 +=arr[i][n-i-1];
            sum1=sum2=0;

            for(int j=0;j<n;j++){
                sum1 += arr[i][j];
                sum2 +=arr[j][i];
            }
            answer = Integer.max(answer,sum1);
            answer = Integer.max(answer,sum2);
        }
        answer = Integer.max(answer,crs1);
        answer = Integer.max(answer,crs2);





        return answer;
    }
}
