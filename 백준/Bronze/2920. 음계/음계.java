import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        if (input.equals("1 2 3 4 5 6 7 8")) {
            System.out.println("ascending");
        } else if (input.equals("8 7 6 5 4 3 2 1")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}