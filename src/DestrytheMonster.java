import java.util.Scanner;

public class DestrytheMonster {

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int p = Integer.valueOf(input[0]);
        int x = Integer.valueOf(input[1]);
        int newPower = x;
        int time=0;
        int i =1;
        while(p > 0){
            p=p-newPower;
            newPower = newPower + x;
            time = time + i;
            i++;
        }
        System.out.println(time);
    }
}
