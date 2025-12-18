public class ExampleForExceptionHandling {
    public static void main(String[]agrs){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int a = s.nextInt();
        System.out.println("Enter the denominator:");
        int b =s.nextInt();
        try{
            int quoitent=a/b;
            System.out.println(quotient);
        }
        catch(Exception e)
        {
            System.out.println("dabba fellow,we cant divide the number by zero:");
        }
    }
    
}
