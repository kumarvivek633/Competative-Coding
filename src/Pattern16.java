import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		int count = (2*no)-1;
		if (no >= 1 && no <= 1000) {
			for (int i = no; i > 0; i--) {
				int numberOfSpaces = 2 * (no - i);
				String space = numberOfSpaces!=0?String.format("%" + numberOfSpaces + "s", " "):"";
				System.out.print(space);
				for (int j = 0; j <= i; j++) {
					if (((j + 1) <= i) && i!=1) {
						System.out.print(count + " ");
					}else if(((j + 1) <= i) && i==1){
						System.out.print(count);
					}
				}
				for (int j = 0; j < i - 1; j++) {
					if ((j + 1) < i - 1) {
						System.out.print(count + " ");
					} else {
						System.out.print(count);
					}
				}
				System.out.println();
				count=count-2;
			}
		}
	}
}
