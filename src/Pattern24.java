import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		if (no >= 1 && no <= 100) {
			for (int i = 0; i < no; i++) {
				for (int j = no - 1 - i; j <= no - 1; j++) {
					if (j + 1 != no) {
						System.out.print(j + " ");
					} else {
						System.out.print(j);
					}
				}
				System.out.println();
			}
			for (int i = 1; i < no; i++) {
				for (int j = i; j <= no - 1; j++) {
					if (j + 1 != no) {
						System.out.print(j + " ");
					} else {
						System.out.print(j);
					}
				}
				System.out.println();
			}
		}
	}
}
