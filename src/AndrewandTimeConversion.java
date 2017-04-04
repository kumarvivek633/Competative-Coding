import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by vivekk on 4/4/2017.
 */
public class AndrewandTimeConversion {

    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            String hour = new BigDecimal(input).divide(new BigDecimal("60"), 2, RoundingMode.CEILING).toString();
            String[] output = hour.split("\\.");
            System.out.println(output[0]);
            System.out.print(new BigDecimal("." + output[1]).multiply(new BigDecimal("60")).intValue());
    }
}
