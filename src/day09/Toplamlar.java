package day09;

import java.util.Scanner;

public class Toplamlar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*        int sayi;
        int toplam=0;
        do {
            System.out.print("Sayı : ");
            sayi=input.nextInt();
            toplam +=sayi;
        }while (sayi!=0);
        System.out.println("Toplam = "+toplam);*/

        int sayi,toplam=0;
        System.out.print("Sayı : ");
        sayi=input.nextInt();
        while (sayi!=0){
            toplam +=sayi;
            System.out.print("Sayı : ");
            sayi=input.nextInt();
        }
        System.out.println("Toplam = "+toplam);
    }
}
