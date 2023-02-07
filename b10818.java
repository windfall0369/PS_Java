import java.util.Scanner;

public class b10818 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int[] arr = new int[9];
        int n=arr[0];
        int n2=0;

        for(int i=0;i<9;i++){
            arr[i]=x.nextInt();
        }


        for(int i=0;i<9;i++){
            if(n<=arr[i]){
                n=arr[i];
                n2=i;
            }
        }
        System.out.println(n);
        System.out.println((n2+1));


    }

}
