import java.util.Stack;

public class q5003 {
//인형뽑기
    public int q5003(int n, int m, int [][] arr1, int [] arr2) {
        int answer=0;

        Stack<Integer> stk = new Stack<>();



        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[j][arr2[i]-1]!=0){
                    int pos = arr1[j][arr2[i]-1];
                    arr1[j][arr2[i]-1]=0;

                    if(!stk.isEmpty() && stk.peek()==pos){
                        answer+=2;
                        stk.pop();
                        break;
                    }else{
                        stk.push(pos);
                    }

                    break;
                }

            }
        }

        return answer;
    }

}
