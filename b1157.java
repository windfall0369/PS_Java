import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = a.readLine().toUpperCase();

        int arr[] = new int[26];

        for (int i = 0; i < word.length(); i++) {
                if (0<= word.charAt(i)-65 && word.charAt(i)-65<=26) {
                    arr[word.charAt(i)-65]++;
                }
            }

        int max = -1;
        char ch='?';

        for(int i=0;i<26;i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);




        b.flush();
        b.close();

    }

}
