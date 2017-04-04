import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by vivekk on 4/3/2017.
 */
public class DivisibleBy15 {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++){
            BigInteger input = new BigInteger(sc.nextLine());
            if(input.mod(new BigInteger("15")).equals(new BigInteger("0")))System.out.println("Yes");
            else System.out.println("No");
        }
    }

}
