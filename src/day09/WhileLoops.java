package day09;

public class WhileLoops {
    public static void main(String[] args) {
/*        int i=0;
        while (i<5){
            System.out.println("Merhaba!");
            i++;
        }*/

        //1'den 10'a kadar olan sayıların toplamını bulan Java programı yazınız.
        //i---->1 2
        //t---->0 2
/*        int i=0,toplam=0;
        while (++i<=10){
            System.out.println("i->"+i);
            toplam=toplam+i;//toplam +=i;
            System.out.println("t->"+toplam);
        }
        System.out.println();
        System.out.println("Toplam = "+toplam);*/

/*        int i=1, toplam=0;
        do {
            toplam +=i;
            i++;
        }while (i<=100&toplam<50);
        System.out.println("Toplam= "+toplam);*/



        int i=1, toplam=0;
        while (i<=100) {



            toplam +=i;
            System.out.println("t->"+toplam);
            System.out.println("i-->"+i);
            i++;
            if(toplam>500){
                break;
            }

        }
        System.out.println();
        System.out.println("Toplam= "+toplam);
    }
}
