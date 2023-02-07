public class q2012 {
    public int q2012(int n, int m, int[][]arr) {

        int answer = 0;

        for(int i=1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                int cnt=0;
                for (int k=0;k<m;k++){
                    int pi=0,pj=0;
                    for(int s=0;s<n;s++) {
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

}
