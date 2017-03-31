import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		if(no >=1 && no <=1000){
			for(int i = 0; i < no ; i++){
				int code = 65;
				for(int j=0;j<=no-i-1;j++){
					if(j==no-i-1){
						System.out.print(Character.toString((char)code));
					}else{
						System.out.print(Character.toString((char)code) + " ");
					}
				code++;	
				}
				System.out.println();
			}
		}

	}

}
