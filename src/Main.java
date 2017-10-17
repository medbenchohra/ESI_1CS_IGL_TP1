import java.security.SecureRandom;

public class Main {

    public int function () {
        return 0;
    }

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        System.out.println("Hello World!");

        while (true) System.out.println(sr.nextInt(5));


    }

}
