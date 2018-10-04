package module1;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       int a=scan.nextInt();

        for (int i=1; i<a+1; i++){
            int b= a%i;
            if (b==0){
                System.out.print(i+" ");
            }

        }

    }
}
