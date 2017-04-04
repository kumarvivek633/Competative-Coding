import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vivekk on 4/4/2017.
 */
public class LittleShinoAndCommonFactors {

    public static void main(String args[]) {
        try{
            Scanner sc = new Scanner(System.in);
            String[] input = sc.nextLine().split(" ");
            if(Integer.valueOf(input[0]) >= 1 && Integer.valueOf(input[1]) <= Math.pow(10,12)) {
                List a = commonFactors(Integer.valueOf(input[0]));
                a.retainAll(commonFactors(Integer.valueOf(input[1])));
                System.out.print(a.size());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    private static List<Integer> commonFactors(int testData){
        List<Integer> output = new ArrayList();
        output.add(1);
        for(int i=2 ; i < testData; i++){
            if(testData%i == 0){
                output.add(i);
            }
        }
        output.add(testData);
        return output;
    }
}
