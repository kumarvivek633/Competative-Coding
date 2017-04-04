import java.util.Scanner;

/**
 * Created by vivekk on 4/3/2017.
 */
public class Blocks {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] intput = new int[n][5];

        for (int i = 0; i < n; i++) {
            String[] inputString = sc.nextLine().split(" ");
            intput[i][0] = Integer.valueOf(inputString[0]);
            intput[i][1] = Integer.valueOf(inputString[1]);
            intput[i][2] = Integer.valueOf(inputString[2]);
            intput[i][3] = Integer.valueOf(inputString[3]);
            intput[i][4] = Integer.valueOf(inputString[4]);
        }
        int height = intput[0][1]+1;
        int flag = intput[0][3];
        for (int i = 1; i < n; i++) {
            if(intput[i][4] > intput[i-1][4]+intput[i-1][0]){
                if(height < intput[i][1]+1){
                    height = intput[i][1]+1;
                    flag = intput[i][3];
                }
            }else{
                if(intput[i][3] == flag){
                    height = height + intput[i][1]+1;
                }
            }
        }

        System.out.println(height);
    }

}
