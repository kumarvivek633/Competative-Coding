import java.util.Scanner;

/**
 * Created by vivekk on 3/30/2017.
 */
public class Detained {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if( n>= 1 && n <= 100 && m>= 0 && m <= 100 && m<=n){
            if(2*m >= n){
                System.out.print("Not Detained");
            }else{
                System.out.print("Detained");
            }
        }
        else
            System.out.print("Detained");
    }

}
