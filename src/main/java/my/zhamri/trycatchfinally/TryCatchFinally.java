package my.zhamri.trycatchfinally;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println("Before x");
            int x = 7/0;
            System.out.println("After x");
        } catch (ArithmeticException e){
            System.out.println("This is ArithmeticException");
        } catch (Exception e){
            System.out.println("This is Exception");
        } finally {
            System.out.println("This is finally");
        }
        System.out.println("End");
    }
}
