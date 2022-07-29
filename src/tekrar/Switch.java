package tekrar;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        int bakiye = 1000;
        int islem;


        System.out.println("1: Bakiye goruntule");
        System.out.println("2: Para Yatirma");
        System.out.println("3: Para Cekme");
        System.out.println("4: Sistemden Cikis");

        System.out.println("lutfen bir islem seciniz");
        islem = scan.nextInt();


        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz " + bakiye + "tl dir.");
                break;
            case 2:
                System.out.println("ne kadar yatiracaksiniz");
                int yatirilanMiktar = scan.nextInt();
                bakiye += yatirilanMiktar;

                System.out.println("Bakiyeniz " + bakiye + "tl dir.");
                break;
            case 3:
                System.out.println("ne kadar cekeceksin");
                yatirilanMiktar = scan.nextInt();
                bakiye -= yatirilanMiktar;
                System.out.println("Bakiyeniz " + bakiye + "tl dir.");
                break;

            case 4:
                System.out.println("sistemden cikiliyor");
                break;

            default:
                System.out.println("hatali giris yaptiniz");
                break;
        }

    }
}