public class Introduction {

    public static void main(String[] args) {
        System.out.println("Bùi Đình Nguyên\t24021585\tCS5\tdinhnguyen24021585\t24021585@vnu.edu.vn");
        for(int i = 9; i >= 0; i--){
            if (i > 1){
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around, ");
            }
            else if (i == 1){
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around, ");
            }
            else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }

}