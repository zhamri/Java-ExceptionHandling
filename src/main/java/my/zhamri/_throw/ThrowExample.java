package my.zhamri._throw;

class ThrowExample {

    public static double divideOperation(double x, double y){
        if (y == 0) {
            throw new ArithmeticException("y cannot zero");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try {
            double result1 = divideOperation(10,3);
            double result2 = divideOperation(10,0);
            System.out.println(result1);
            System.out.println(result2);
        } catch (Exception e) {
            System.out.println("Inside main method");
            System.out.println("Main: y cannot zero");
        }
    }
}
