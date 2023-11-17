
public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Welcome in Exception");

        try {

            int a=25, result;
        result = a / 0;
        System.out.println("Quotient = "+result);
            
        } 
        catch (ArithmeticException e) 
        {
           // System.out.println(e);
           e.printStackTrace();
        }
        finally
        {
            System.out.println("This runs at least once...");
        }

         System.out.println("End of program....");
        System.out.println("Bye byeeeeeee");
    }
}
