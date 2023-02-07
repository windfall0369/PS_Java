import java.util.LinkedList;
import java.util.Queue;


class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id=id;
        this.priority=priority;
    }
}


public class q5008 {

    public int q5008(int n, int k, int [] arr) {
        int answer =0;
        Queue<Person> Q = new LinkedList<>();

        for(int i=0;i<n;i++){
            Q.offer(new Person(i,arr[i]));
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();

            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if(tmp.id==k){
                    return answer;
                }
            }

        }





        return answer;
    }

}
