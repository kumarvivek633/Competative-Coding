import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		if (no >= 1 && no <= 100) {
			for (int i = no - 1; i >= 0; i--) {
				for (int j = no - 1; j > i - 1; j--) {
					if (j - 1 == i - 1)
						System.out.print("*");
					else {
						System.out.print("*" + " ");
					}
				}
				System.out.println();
			}
			for (int i = 1; i < no; i++) {
				for (int j = no - 1; j >= i; j--) {
					if (j - 1 == i - 1)
						System.out.print("*");
					else {
						System.out.print("*" + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
