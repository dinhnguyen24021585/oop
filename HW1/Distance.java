import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);

        System.out.println(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
}
