import java.util.Stack;

public class q5001 {

    public String q5001(String n) {
        String answer="YES";

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)=='('){
                stack.push(n.charAt(i));
            }else {
                if(stack.isEmpty()){
                    return "NO";
                }else {
                    stack.pop();
                }

            }
        }
        if (stack.isEmpty()==false){
            return "NO";
        }



        return answer;
    }

}
