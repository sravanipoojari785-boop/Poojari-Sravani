import java.util.*;
public class ExampleForCollection {
    public static void main(String[] args) {
		/*List l1=new vector();
		List l2=new stack();
		List l3=new LinkedList();*/
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("List"+l);
		for(Object i:l)
		{
			System.out.println(i);
		}
		System.out.println(l.size());
		System.out.println(l.contains(30));
		System.out.println(l.get(1));
		System.out.println("-------------------------------------------------");
		ArrayList al=new ArrayList();
		al.add(02);
		al.add(03);
		al.add(47);
		al.add(48);
		al.add(63);
		System.out.println("ArrayList:"+al);
		for(Object i:al)
		{
			System.out.println(i);
		}
		System.out.println(al.size());
		System.out.println(al.contains(03));
		System.out.println(al.get(4));
	}

}