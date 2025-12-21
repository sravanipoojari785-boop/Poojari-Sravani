
import java.util.HashMap;

public class ExampleForHashMap {
    public static void main(String[] args) {
        //Map s = new hashMap();
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Name","lucky");
        hm.put("place","chennai");
        System.out.println(hm);
        System.out.println("--------------------");
        System.out.println(hm.get("Name"));
        System.out.println("---------------------");
        for(Object i : hm.keySet()){
            System.out.println(i);
        }
        
    }
}
    