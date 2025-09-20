import java.util.Random;

public class SumOfTwoDices {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice1, dice2;
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;

        System.out.println(dice1 + dice2);
    }
}
