import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		if (no >= 1 && no <= 100) {
			for (int i = no - 1; i >= 0; i--) {
				int count = 65 + i;
				for (int j = no - 1; j > i - 1; j--) {
					if (j - 1 == i - 1) {
						System.out.print(Character.toString((char) count));
						count++;
					} else {
						System.out.print(Character.toString((char) count) + " ");
						count++;
					}
				}
				System.out.println();
			}
			for (int i = 1; i < no; i++) {
				int count = 65 + i;
				for (int j = no - 1; j >= i; j--) {
					if (j - 1 == i - 1) {
						System.out.print(Character.toString((char) count));
						count++;
					} else {
						System.out.print(Character.toString((char) count) + " ");
						count++;
					}
				}
				System.out.println();
			}
		}
	}
}
