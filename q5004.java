import java.util.Stack;

public class q5004 {

    public int q5004(String n) {
        int answer=0;

        Stack<Integer> stack = new Stack<>();

        for(char x : n.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        answer=stack.pop();


        return answer;
    }

}
