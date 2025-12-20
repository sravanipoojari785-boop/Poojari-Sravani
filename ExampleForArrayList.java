import java.util.*;
class Student{
    private String name;
    private int age;
    public String getname(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    Student(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name= "+name +"Age= "+age;
    }

}
public class ExampleForArrayList {
    public static void main(String[] args) {
        Student s1=new Student("Falthos", 20);
        Student s2=new Student("Killer", 20);
        ArrayList<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        for(Object i:al){
            System.out.println(i);
        }
    }
    
}