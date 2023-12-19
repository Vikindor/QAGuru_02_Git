package qaguru.vikindor;

public class Main {

    private static String msg = "Hello QA Guru!!!";

    public static void main(String[] args) {
        System.out.print(getMessage());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public static String getMessage() {
        return msg;
    }
}