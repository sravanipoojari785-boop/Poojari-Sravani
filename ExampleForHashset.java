import java.util.LinkedHashSet;

public class ExampleForHashset {
    public static void main (String[]args){
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        System.out.println(lhs);
        for(Object i: lhs)
        {
            System.out.println(i);
        }

        

    }
    
}
