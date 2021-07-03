package ExceptionHnadling;

public class MainClass {
    public static void main(String[] args) {

        try {
            int a=4;
            int b=0;
            int c=a/b;
            System.out.println(c);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" Plese check your code: ");
        }
        System.out.println("need to check your code: ");
    }
}
