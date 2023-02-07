import java.util.Scanner;

public class b8958r {
    public  static  void main(String[] args){


        //한 문장 단위로 받을 수도 있음
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        String [] testcase  = new String[n];

        for(int i=0;i<n;i++){
            testcase[i]=s.next();
        }


        for(int i=0;i<n;i++){
            int count = 0;
            int sum =0;

            for(int j=0;j<testcase[i].length();j++){
                if(testcase[i].charAt(j)=='O'){
                    count++;
                }else{
                    count =0;
                }
                sum +=count;
            }
            System.out.println(sum);
        }






    }

}
