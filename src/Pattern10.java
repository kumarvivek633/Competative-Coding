import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.close();
		int count = 65;
		if(no >=1 && no <=1000){
			for(int i = 0; i < no ; i++){
				StringBuffer space = new StringBuffer();
				for(int k = 0;k<2*no-(2*i)-2;k++){
					space.append(" ");
				}
				System.out.print(space);
				for(int j=0;j<=i;j++){
					if((j+1)<=i){
						System.out.print(Character.toString((char)count) + " ");
					}
				}
				
				for(int j=0;j<=i;j++){
					if((j+1)<=i){
						System.out.print(Character.toString((char)count) + " ");
					}else{
						System.out.print(Character.toString((char)count));
					}
					
				
				}
				System.out.println();
				count++;
			}
		}

	}



}
