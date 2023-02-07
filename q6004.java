public class q6004 {
    public int[] q6004(int s, int n, int [] arr) {
        int [] answer= new int [s];

        for (int x : arr) {
            int pos=-1;
            for (int i = 0; i < s; i++) {
                if(x==answer[i]){
                    pos=i;
                }
            }


            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    answer[i]=answer[i-1];
                }
            }
            else {
                for (int i = pos; i >= 1; i--) {
                    answer[i]=answer[i-1];
                }
            }

            answer[0]=x;
        }

        return answer;
    }

}
