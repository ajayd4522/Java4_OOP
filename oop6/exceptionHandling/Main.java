package objectOrientedProgramming.oop6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            // int c = a/b;
            // int c = a + b;
            // divide(a, b);

            //mimicking stuff
            String name = "ajay";
            if(name.equals("ajay")){
                throw new MyException("name is ajay");
            }


        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }                                           // way of using exception always in right order, like you cannot use Exception before ArithmaticException,
                                                    //  the error was caught before by Exception so there is no use of Arithmatic Exception
        catch (Exception e){
            System.out.println(e.getMessage());
        }    
        finally {
            System.out.println("this will always execute");
        }

    }

    static int divide (int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide it by zero");
        }
        return a/b;
    }
}
