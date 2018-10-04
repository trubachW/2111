package module1;

import java.util.Scanner;

public class shaxmati {
    public static void main(String[] args) {
        int a,b,c,d,f,g,i;
        Scanner scan=new Scanner(System.in);
        char b1[]={'0','А','Б','В','Г','Д','Е','Ё','Ж'};
        char b2[]={'0','A','B','C','D','E','F','G','K'};
        char a1[][]=new char[9][9];
        f=0;
        for (i=0; i<9; i++){
            for (g=0; g<9; g++){
                if (i==0 && g>=1){
                    a1[i][g] = b1[f];

                }else if (i>=1 && g==0){
                    a1[i][g] = b2[f];
                }else if (i>=1 && g>=1){
                    a1[i][g] = 'x';
                }

                f++;
                System.out.print(a1[i][g]+" ");
            }
            System.out.println();
        }
    }


}
 //*if (i==0 && g==1){
      //  a1[i][g]='z';
       // }else if (i==0 && g==6) {
       // a1[i][g]='z';
       // }else {
       // a1[i][g] = 'x';
      //  }