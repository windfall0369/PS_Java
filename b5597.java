import java.util.Scanner;

public class b5597 {
    public  static void main(String[] args){

    Scanner s = new Scanner(System.in);
    int [] arr = new int[28];

    for(int i=0;i<28;i++){
        arr[i]=s.nextInt();
    }

    int [] min =  {1,2,3,4,5,6,7,8,9,10,11,
                12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30};

    for(int i=0;i<28;i++){
        for(int j=1;j<30;j++){
            if(arr[i]==j){
                min[j-1]=0;
            }

        }
    }

    int n=0;
    for(int i=0;i<30;i++){
        if(n==2) {
        break;
        }else{
            if (min[i] != 0) {
                System.out.println(min[i]);
                n++;
            }
        }
    }


    }

}
