import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();sc.close();
		int count;
		if(no >=1 && no <=1000){
			for(int i = 0; i < no ; i++){
				count = 1;
				StringBuffer space = new StringBuffer();
				for(int k = 0;k<2*no-(2*i)-2;k++){
					space.append(" ");
				}
				System.out.print(space);
				for(int j=0;j<=i;j++){
					if((j+1)<=i){
						System.out.print(count + " ");
						count++;
					}
				}
				
				for(int j=0;j<=i;j++){
					if((j+1)<=i){
						System.out.print(count + " ");
						count++;
					}else{
						System.out.print(count);
						count++;
					}
					
				
				}
				System.out.println();
			}
		}

	}



}
