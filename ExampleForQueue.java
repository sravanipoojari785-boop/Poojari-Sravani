import java.util.PriorityQueue;

public class ExampleForQueue {
    public static void main(String[] args) {
        //Queue s = new PriorityQueue();
        PriorityQueue pq= new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq);
        System.err.println("--------------------");
       for(Object i : pq){
        System.err.println(pq);
       }
       System.err.println("--------------------");
       System.err.println("pq.poll()");
    }
        
    }
    
