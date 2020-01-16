package testdddd;

public class Test {
    public static void main(String[] args) {
//        Factorial f =new Factorial();
        if (Factorial.fact(10) == 3628800) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

