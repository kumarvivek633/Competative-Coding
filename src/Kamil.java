import java.util.Scanner;


public class Kamil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        int count = 4*input.length() - (input.replace("F", "").length() + input.replace("T", "").length() + input.replace("D", "").length() + input.replace("L", "").length());
        System.out.print(count*2);
    }
}
