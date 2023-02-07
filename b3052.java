import java.util.Scanner;

public class b3052 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int []arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i]=s.nextInt()%42;
        }

        int n=0;
        int cnt=0;
        for(int i=0;i<10;i++)
        {
            n = 0;
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]){
                    n++;
                }
            }if(n==0){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

}
