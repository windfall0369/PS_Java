import java.util.Arrays;

public class q6005 {
    //정렬사용 hashmap으로도 가능

    public String q6005(int n, int [] arr) {
        String answer= "U";
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }


        return answer;
    }

}
