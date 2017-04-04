import java.util.Arrays;
import java.util.Scanner;


public class CabService {

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cabServices = new int[n][2];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] cabCharge = sc.nextLine().split(" ");
            cabServices[i][0] = Integer.valueOf(cabCharge[0]);
            cabServices[i][1] = Integer.valueOf(cabCharge[1]);
        }
        Arrays.sort(cabServices, (a, b) -> Double.compare(a[0], b[0]));
        int noTest = sc.nextInt();
        for (int i = 0; i < noTest; i++) {
            int testInput =0;
            if(sc.hasNextInt())
            {
                testInput = sc.nextInt();
            }
            int min =testInput * cabServices[0][1] + cabServices[0][0] ;
            for (int j = 1; j < n && min > cabServices[j][0]; j++) {
                if(testInput * cabServices[j][1] + cabServices[j][0] < min){
                    min = testInput * cabServices[j][1] + cabServices[j][0];
                }
            }
            //if(min == 4939871)Thread.sleep(1000);
            System.out.println(min);
        }
    }
}