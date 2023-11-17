
public class StringRelatedException {
    public static void main(String[] args) {

   
        try {
                String str = "Triton";
                 System.out.println("Character at index 15 is "+str.charAt(15));

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae);
        }

        catch(NullPointerException npe)
        {
            System.out.println(npe);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

        System.out.println("End of program...");
    }
}
