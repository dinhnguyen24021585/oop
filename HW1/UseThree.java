import java.util.Scanner;

public class UseThree {
    public static void main(String[] args) {
        args = new String[3];
        for(int i = 0; i < args.length; i++) {
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            args[i] = name;
        }
        System.out.print("Hi, ");
        System.out.print(args[2] + ", " + args[1] + " and " + args[0]);
        System.out.print(". How are you?");
    }
}
