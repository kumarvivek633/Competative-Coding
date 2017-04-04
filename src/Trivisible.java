import java.util.Scanner;

/**
 * Created by vivekk on 4/3/2017.
 */
public class Trivisible {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int count = 0;
        for(int i=0;i<n; i++){
            if(Integer.valueOf(input[i])%3 != 0){
                count++;
            }
        }
        System.out.print(count);

    }
}
