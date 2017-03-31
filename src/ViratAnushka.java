import java.util.Scanner;

/**
 * Created by vivekk on 3/30/2017.
 */
public class ViratAnushka {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        int min;
        if(n >= 1 && m <= 100){
            int[][] input = new  int[n][m];
            for (int i = 0 ; i< n; i++){
                min = 0;
                for(int j=0; j< m; j++){
                    input[i][j] = sc.nextInt();
                    if(j==0){
                        min = input[i][j];
                    }else{
                        if(input[i][j]< min){
                            min = input[i][j];

                        }
                    }
                }
                if(i == 0 || max < min){
                    max = min;
                }

            }
            System.out.print(max);
        }
    }
}
