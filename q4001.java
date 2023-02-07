import java.util.HashMap;

public class q4001 {

    public char q4001(int n, String str) {
        char answer=' ';

        HashMap<Character,Integer> map = new HashMap<>();

        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }


        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if (map.get(key) > max) {
                max = map.get(key);
                answer=key;
            }
        }



        return answer;
    }
}
