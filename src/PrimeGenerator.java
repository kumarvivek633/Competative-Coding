import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {
		boolean flag;
		Scanner in = new Scanner(System.in);
		int no_case = Integer.parseInt(in.nextLine().trim());
		if (no_case < 10) {
			for (int i = 0; i < no_case; i++) {
				String[] str = in.nextLine().split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);
				if (x >= 1 && y <= 1000000000 && x <= y && (y - x) <= 100000) {
					for (int j = x; j <= y; j++) {
						flag = false;
						for (int k = 1; k <= j / 2; k++) {
							if (k != 1 && j % k == 0) {
								flag = true;
							}
						}
						if (flag == false && j != 1) {
							System.out.println(j);
						}
					}
					System.out.println();
				}
			}
		}
	}
}
