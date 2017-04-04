import java.util.List;
import java.util.Scanner;

/**
 * Created by vivekk on 4/4/2017.
 */
public class FredoandArrayUpdate {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int sum =0;
        for(int i =0; i<n; i++){
            sum = sum + Integer.valueOf(input[i]);
        }
        int i =1;
        while(n*i <= sum){
            i++;
        }
        System.out.print(i);
    }
}
