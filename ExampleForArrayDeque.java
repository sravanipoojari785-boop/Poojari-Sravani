import java.util.ArrayDeque;

public class ExampleForArrayDeque {
    public static void main(String[] args) {
        //Deque d = new ArrayDeque();
        ArrayDeque<Integer> d = new ArrayDeque<Integer>();
        d.add(10);
        d.add(20);
        d.add(30);
        System.out.println("d.poll");
        System.out.println("-------------------");
        for(Object i : d){
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("d.remove");
        System.out.println("---------------------");
        System.out.println(d);
         
        
    }
    
}
