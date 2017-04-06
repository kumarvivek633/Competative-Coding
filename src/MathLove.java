import java.util.Scanner;

/**
 * Created by vivekk on 4/5/2017.
 */
public class MathLove {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input != 0){
            int inputData = sc.nextInt();
            if(input > 0 && inputData <= 3*Math.pow(10,9)) {
                int d = 1 + 8 * inputData;
                double root1 = (-1 + Math.sqrt(d)) / (2);
                double root2 = (-1 - Math.sqrt(d)) / (2);
                if ((root1 % 1) == 0) System.out.println((int) root1);
                else if ((root2 % 1) == 0) System.out.println((int) root2);
                else System.out.println("NAI");
                input--;
            }
        }
    }
}
