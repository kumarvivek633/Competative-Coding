import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		if (no >= 1 && no <= 26) {
			for (int i = no; i > 0; i--) {
				int count = 65;
				int numberOfSpaces = 2 * (no - i);
				String space = numberOfSpaces != 0 ? String.format("%" + numberOfSpaces + "s", " ") : "";
				System.out.print(space);
				for (int j = 0; j <= 2 * i - 1; j++) {
					if (((j + 1) <= i) && i != 1) {
						System.out.print(Character.toString((char) count) + " ");
						count++;
					} else if (((j + 1) <= i) && i == 1) {
						System.out.print(Character.toString((char) count));
						count++;
					}
				}
				for (int j = 0; j < i - 1; j++) {
					if ((j + 1) < i - 1) {
						System.out.print(Character.toString((char) count) + " ");
						count++;
					} else {
						System.out.print(Character.toString((char) count));
						count++;
					}
				}
				System.out.println();
			}
		}
	}
}
