import java.util.LinkedList;
import java.util.Queue;

public class q5007 {

    public String q5007(String  n, String k) {
        String answer ="NO";
        Queue<Character> Q = new LinkedList<>();

        for (int i = 0; i < n.length(); i++) {
            Q.offer(n.charAt(i));
        }

        for (int i = 0; i < k.length(); i++) {
            if(Q.contains(k.charAt(i))){
                if(k.charAt(i)==Q.peek()){
                    Q.poll();
                }else {
                    return "NO";
                }
            }
        }

        if (Q.size() == 0) {
            return "YES";
        }




        return answer;
    }

}
