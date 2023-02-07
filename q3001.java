import java.util.ArrayList;

public class q3001 {

    public ArrayList<Integer> q3001(int n, int m, int[]arr1, int []arr2) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if(arr1[p1]<arr2[p2]){
                answer.add(arr1[p1++]);
            }else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1<n) answer.add(arr1[p1++]);
        while (p2<m) answer.add(arr2[p2++]);

        return answer;
    }

}
