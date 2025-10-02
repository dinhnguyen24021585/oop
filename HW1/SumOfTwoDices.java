import java.util.Random;

public class SumOfTwoDices {
    public static void main(String[] args) {
        int dice1,  dice2;
        dice1 = (int)Math.floor(Math.random() * 6)+ 1;
        dice2 = (int)Math.floor(Math.random() * 6)+ 1;

        System.out.println(dice1 + dice2);
    }
}
