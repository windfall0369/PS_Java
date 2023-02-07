import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class q4005 {
    public int q4005(int n,int k, int[] arr) {

        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        HashMap<Character,Integer> map1 = new   HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt=0;
        for(int x: Tset){
            cnt++;
            if(cnt==k) return x;
        }



        return answer;
    }

}
