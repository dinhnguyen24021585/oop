import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x , y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();

        double dis = Math.sqrt(x * x + y * y);
        System.out.println(dis);
    }


}
