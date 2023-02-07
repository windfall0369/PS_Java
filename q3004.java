public class q3004 {
    public int q3004(int n, int m, int[]a) {
        int answer=0;
        int sum=0;
        int x=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if(sum>m){
                sum=0;
                i=x;
                x++;
            } else if (sum==m) {
                answer++;
            }

        }

        return answer;
    }


    public int q3004a(int n,int m,int[] a){
        int answer=0;
        int sum=0;
        int lt=0;

        for (int rt = 0; rt < n; rt++) {
            sum+=a[rt];
            if (sum == m) {
                answer++;
            }
            while (sum>=m){
                sum-=a[lt++];
                if(sum==m){
                    answer++;
                }
            }
        }
        return  answer;
    }

}
