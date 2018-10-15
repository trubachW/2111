package module1;

import java.util.Scanner;

public class kruglyashi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       int count=0;
       int count1 = 0;
        int a=scan.nextInt();
        int save=a;
        while(a>0){
            a/=10;
            count++;
        }
        int b,i=0;
        int[] cats = {6, 9, 0,8};
        int f[] = new int[count];
        while(save>0){
            b=save%10;
            f[i]=b;
            i=i+1;
            save/=10;
        }
        for (int h=0; h<f.length; h++){
            for (int j=0; j<cats.length; j++){
                if (f[h]==cats[j] ){
                    if (f[h]!=8){
                    count1++;
                    }else {
                        count1=count1+2;
                    }
                }
            }
        }
        System.out.print("кол-во кругляшей= "+count1);
    }
}
