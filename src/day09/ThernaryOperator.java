package day09;

import java.util.Scanner;

public class ThernaryOperator {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının mutlak değerini bulunuz.
        Scanner input=new Scanner(System.in);
/*        System.out.print("Sayı : ");
        int sayi=input.nextInt();
        int md=sayi;
        if (sayi<0){
            md=-sayi;
        }
        System.out.println("|"+sayi+"| = "+md);*/

        System.out.print("Sayı : ");
        int sayi=input.nextInt();
        //int md=sayi<0?-sayi:sayi;
        System.out.println("|"+sayi+"| = "+(sayi<0?-sayi:sayi));
        // condition?case 1:case 2;
    }
}
