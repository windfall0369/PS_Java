import java.util.HashMap;

public class q4004 {

    public int q4004(String a, String b) {

        int answer=0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < b.length(); i++) {
            map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0)+1);
        }

        for (int i = 0; i < b.length()-1; i++) {
            map1.put(a.charAt(i),map1.getOrDefault(a.charAt(i),0)+1);
        }

        int lt=0;

        for (int rt = b.length()-1; rt < a.length(); rt++) {
            map1.put(a.charAt(rt),map1.getOrDefault(a.charAt(rt),0)+1);
            if(map1.equals(map2)){
                answer++;
            }
            map1.put(a.charAt(lt),map1.get(a.charAt(lt))-1);

            if(map1.get(a.charAt(lt))==0){
                map1.remove(a.charAt(lt));
            }

            lt++;

        }


        return answer;
    }

}
