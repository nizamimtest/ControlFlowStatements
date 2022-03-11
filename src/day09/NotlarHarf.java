package day09;

import java.util.Scanner;

public class NotlarHarf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //condition?case 1: case 2
        System.out.print("Notu giriniz [0-100] : ");
        int not=input.nextInt();
        String notHarf=not<60?"FF":not<70?"DD":not<80?"CC":not<90?"BB":not<=100?"AA":"GEÇERSİZ";
        System.out.println(not+"--> "+notHarf);




    }
}
