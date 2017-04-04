import java.util.Scanner;

public class BuyingCandies {
    public static void main(String args[]){
        int t,n,ch;
        Scanner input= new Scanner(System.in);
        t=input.nextInt();
        for(int i=0;i<t;i++){

            n=input.nextInt();
            if(n!=1){
                for(int j=n;j<=100000;j++){
                    ch=0;
                    for(int k=2;k<=Math.sqrt(n);k++){
                        if(j%k==0){
                            ch=1;
                            break;
                        }
                    }
                    if(ch==0){
                        System.out.println(j*2);
                        break;
                    }

                }
            }
            else if(n==1)
                System.out.println(1);

        }
    }
}