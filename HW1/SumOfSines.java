public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);

        t = t / 180 * Math.PI;
        System.out.println(Math.sin(2*t) + Math.sin(3*t));
    }
}
