import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by vivekk on 4/5/2017.
 */
public class Bytelandiangoldcoins {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        while (in.readLine() !=null && count != 10) {
            count++;
            int input = Integer.valueOf(in.readLine());
            if(input >= 0 && input <= 1000000000){

                int output = 0;
                int data = findLandingoIcone(input);
                System.out.println(data);
            }

        }
    }

    public static int findLandingoIcone(int data) {
        if (data / 2 + data / 3 + data / 4 < data) {
            return data;
        }

        return findLandingoIcone(data / 2) + findLandingoIcone(data / 3) + findLandingoIcone(data / 4);

    }
}
