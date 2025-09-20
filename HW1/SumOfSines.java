import java.util.Scanner;

public class SumOfSines {
    public static void main(String[] args) {
        double t;
        Scanner input = new Scanner(System.in);
        t = input.nextDouble();
        t = t / 180 * Math.PI;
        double sum;
        sum = Math.sin(2 * t) + Math.sin(3 * t);

        System.out.println(sum);
    }
}
