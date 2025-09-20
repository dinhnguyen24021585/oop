public class Introduction {

    public static void main(String[] args) {

        // Prints "Hello, World" in the terminal window.
        System.out.println("Bùi Đình Nguyên\t24021585\tLớp:CS5\tdinhnguyen24021585\t24022585@vnu.edu.vn");

        for (int i = 9; i >= 0; i--){
            if (i != 0) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" bottles of beer on the wall, ");
                }
                else{
                    System.out.print(" bottle of beer on the wall, ");
                }
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" bottles of beer\n");
                }
                else{
                    System.out.print(" bottle of beer\n");
                }
                System.out.println("Take one down, pass it around");
            }
            else{
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }

}