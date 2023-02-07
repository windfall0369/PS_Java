import java.util.Scanner;

public class b1546 {
    public static void main(String[] args){

        Scanner t = new Scanner(System.in);

        int n = t.nextInt();

        int [] arr = new int[n];

        int max=0;
        int sum=0;
        double avg=0;

        for(int i=0;i<n;i++){
            arr[i]=t.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        sum +=arr[i];
        }

        avg=100.0*sum/max/n;

        System.out.println(avg);



    }

}
