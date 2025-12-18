 class denominator{
    void div() throws ArithmeticException 
    {
      int n1 =25;
            int n2 =0;
            System.out.println(n1/n2);
        }
    }
    
public class Throw{
    public static void main(String[]args){
        Demo d = new  Demo ();
        try {
            d.div();
        }
        catch(ArithmeticException e){
      }
      System.out.println("e.getMessage");
    }    
}
