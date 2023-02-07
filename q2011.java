public class q2011 {

    public int q2011(int n, int[][] arr) {
        int answer=0;
        int max =Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=5;k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
}
