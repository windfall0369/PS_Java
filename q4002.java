import java.util.HashMap;

public class q4002 {

    public String q4002(String str1, String str2) {
        String answer="YES";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char x : str1.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for (char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x)==0){
                return "NO";
            }else {
                map.put(x,map.get(x)-1);
            }
        }



        return answer;
    }
}
