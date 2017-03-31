import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int count = 65;
		int count2;
		if (no >= 1 && no <= 26) {
			for (int i = 0; i < no; i++) {
				count2 = count;
				StringBuffer space = new StringBuffer();
				for (int k = 0; k < 2 * no - (2 * i) - 2; k++) {
					space.append(" ");
				}
				System.out.print(space);
				for (int j = 0; j <= i; j++) {
					if ((j + 1) <= i) {
						System.out.print(Character.toString((char) count2) + " ");
						count2--;
					}
				}
				for (int j = 0; j <= i; j++) {
					if ((j + 1) <= i) {
						System.out.print(Character.toString((char) count2) + " ");
						count2++;
					} else {
						System.out.print(Character.toString((char) count2));
						count2++;
					}
				}
				System.out.println();
				count++;
			}
		}
	}
}
