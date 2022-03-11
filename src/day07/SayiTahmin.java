package day07;

import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi=(int)Math.round(Math.random()*10);
        System.out.println("Bir sayı tuttum. Lütfen tahmin ediniz. (3 Hakkınız var)");
        //System.out.print(sayi);
        int tahmin;
        int i = 1;


        for (;i <=3 ; i++) {
            System.out.print((i)+". tahmininiz: ");
            tahmin=input.nextInt();
            if(sayi==tahmin){
                System.out.println("Bildiniz.");
                break;
            }else if (sayi>tahmin){
                System.out.println("Daha büyük bir sayı giriniz.");
            }else {
                System.out.println("Daha küçük bir sayı giriniz.");
            }
        }

        if (i==4){
            System.out.println("Bilemediniz.");
        }

    }
}
