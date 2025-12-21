   

import java.util.LinkedHashMap;

public class ExampleForLinkedHashMap {
    public static void main(String[] args) {
        //map m = new LinkedHashMap();
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Name", "anu");
        lhm.put("age",20);
        System.out.println(lhm);
        System.out.println("-------------------");
        System.out.println(lhm.get(0));
        System.out.println("----------------------");
        System.out.println(lhm.keySet());
        System.out.println("------------------------");
        System.out.println(lhm.entrySet());
        for(Object i : lhm.entrySet()){
            System.out.println(i);
        }

    }
    
}