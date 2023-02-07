public class q3005 {

    public int q3005(int n) {
        int answer=0;
        int sum=0;
        int x=1;

        for(int i=1;i<n;i++){
            sum+=i;
            if(sum>n){
                sum=0;
                i=x;
                x++;
            }else if(sum==n){
                answer++;
                sum=0;
                x++;
                i=x;
            }
        }


        return answer;
    }


    public int q3005a(int n) {
        int answer=0;
        int sum=0;
        int lt=0;
        int m=n/2+1;
        int []arr= new int [m];

        for (int i = 0; i < m; i++) {
            arr[i]=i+1;
        }
        for(int rt = 0; rt < m; rt++) {
            sum+=arr[rt];
            if(sum==n) {
                answer++;
            }

            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int q3005math(int n) {
        int answer =0;
        int cnt=1;
        n--;
        while (n > 0) {
            cnt++;
            n=n-cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }


}
