import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		int numberOfSpaces = 2*no - 2;
		if (no >= 1 && no <= 100) {
			for (int i = no - 1; i >= 0; i--) {

				String space = numberOfSpaces != 0 ? String.format("%" + numberOfSpaces + "s", " ") : "";
				System.out.print(space);
				numberOfSpaces = numberOfSpaces - 2;
				for (int j = no - 1; j > i - 1; j--) {
					if (j - 1 == i - 1) {
						System.out.print("*");
					} else {
						System.out.print("*" + " ");
					}
				}
				System.out.println();
			}
			numberOfSpaces = 2;
			for (int i = 1; i < no; i++) {
				String space = numberOfSpaces != 0 ? String.format("%" + numberOfSpaces + "s", " ") : "";
				System.out.print(space);
				numberOfSpaces = numberOfSpaces + 2;
				for (int j = no - 1; j >= i; j--) {
					if (j - 1 == i - 1) {
						System.out.print("*");
					} else {
						System.out.print("*" + " ");
					}
				}
				System.out.println();
			}
		}
	}
}
