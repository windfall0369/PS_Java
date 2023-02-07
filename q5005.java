import java.util.Stack;

public class q5005 {

    public int q5005(String n) {
        int answer=0;

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<n.length();i++){

            if(n.charAt(i)==')'){
                stack.pop();
                if(n.charAt(i-1)=='('){
                    answer+=stack.size();
                }else {
                    answer++;
                }


            }else if (n.charAt(i)=='('){
                stack.push(n.charAt(i));
            }
        }

        return answer;
    }

}
