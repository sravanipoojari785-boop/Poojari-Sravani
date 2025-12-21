import java.util.LinkedHashSet;
class Student{
    private String rollNo;
    private String name;
    private String email;
public Student(String rollNo,String name,String email){
    super();
    this.rollNo = rollNo;
    this.name =name;
    this.email=email;
}
public String getRollNo(){
    return rollNo;
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
}
    public class ExampleForLinkedHashSet2 {
        public static void main(String[] args) {
            Student s1 = new Student("40","Sravani","Sravani@gmailcom");
            Student s2 = new Student("01","Falthos","Abhi@gmail.com");
            LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
            lhs.add(s1);
            lhs.add(s2);
            for(Object i: lhs)
            {
                System.out.println(i);
            }
            
        }
    }

