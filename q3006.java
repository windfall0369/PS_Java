public class q3006 {
    public int q3006(int n,int k, int [] arr) {
        int answer=0;
        int lt=0;
        int cnt=0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;

            }
            answer = Math.max(answer, rt - lt + 1);

        }
        return answer;
    }


}
