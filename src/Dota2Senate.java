import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        int n = senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                rQueue.add(i);
            }else{
                dQueue.add(i);
            }
        }
        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            if(rQueue.peek()<dQueue.peek()){
                rQueue.add(n++);
            }else{
                dQueue.add(n++);
            }
            rQueue.remove();
            dQueue.remove();
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
