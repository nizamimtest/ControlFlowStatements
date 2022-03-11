package day08;

import java.util.Scanner;

public class Ucgenler {
    public static final int UCGENIN_IC_ACILARI=180;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String gecersiz="Geçersiz bir üçgendir.";

        System.out.println("Lütfen üçgenin iç açılarını Giriniz.");
        System.out.print("A açısı: ");
        int a=input.nextInt();
        if (a<=0) {
            System.out.println(gecersiz);
            System.exit(-1);
        }
        System.out.print("B açısı: ");
        int b=input.nextInt();
        if (b<=0) {
            System.out.println(gecersiz);
            System.exit(-1);
        }

        int toplam=a+b;

        int c=UCGENIN_IC_ACILARI-toplam;

        System.out.println("C açısı = "+c);
/*        System.out.print("C açısı: ");
        int c=input.nextInt();
        if (c<=0) {
            System.out.println(invalidMessage);
            System.exit(-1);
        }*/
/*        int icAcilarinToplami=a+b+c;

        if (icAcilarinToplami==UCGENIN_IC_ACILARI){
            System.out.println("Geçerli bir üçgendir.");
        }else {
            System.out.println(invalidMessage);
        }*/


    }
}
