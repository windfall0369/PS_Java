import java.util.Stack;

public class q5002 {
    public String q5002(String n) {
        String answer=" ";

        Stack<Character> stack = new Stack<>();

        int cnt =0;
        for (int i = 0; i < n.length(); i++) {

            if(n.charAt(i)=='('){
                cnt++;
                continue;
            } else if (n.charAt(i)==')') {
                cnt--;
                continue;
            }


            if (cnt == 0) {
                stack.push(n.charAt(i));
            }
        }

        for(char x : stack){
            answer +=x;
        }


        return answer;
    }
    //위 코드는 ()로 둘러쌓이지 않는 알파벳만 넣음
    //스택에 다 넣고 pop을 통해 ()로 둘러 쌓인 것들을 빼고 남는 알파벳을 구하는 코드 구현해보기

}
