import java.util.Scanner;

public class b2562 {
    public static void Main(String[] args){
        Scanner g = new Scanner(System.in);
        int n=g.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[n]=g.nextInt();
        }

        int min=0;
        for(int i=0;i<n;i++){
            if(min>=arr[n]){
                min=arr[n];
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(max<=arr[n]){
                max=arr[n];
            }
        }

        System.out.println(min + max);



    }
}
