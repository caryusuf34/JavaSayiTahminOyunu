import java.util.Scanner;
import  java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int girilenSayi = 0;
        int kalanHak = 2;
        boolean oyun = true;

        SecureRandom rand = new SecureRandom();
        Scanner giris = new Scanner(System.in);
        int rastgele = rand.nextInt(100);

        while (kalanHak !=0) {
            System.out.println("Lütfen bir sayı giriniz :");
            girilenSayi = giris.nextInt();
            kalanHak -=1;

            if (girilenSayi > 0 && girilenSayi <=100) {
                if (girilenSayi > rastgele) {
                    if (kalanHak > 0){
                        System.out.print((girilenSayi - rastgele) + " kadar yaklaştınız...lütfen daha küçük sayı giriniz ");
                    }
                    else {
                        System.out.println("giriş hakkınız kalmamıştır.");
                    }
                }
                else if (rastgele > girilenSayi) {
                    if (kalanHak > 0){
                        System.out.print((girilenSayi - rastgele) + " kadar yaklaştınız...lütfen daha büyük sayı giriniz ");

                    }
                    else {
                        System.out.println("giriş hakkınız kalmamıştır.");
                    }
                }
                else if (girilenSayi == rastgele) {
                    System.out.print("girilen sayı :" + girilenSayi + "...Tebrikler ....");
                }
            } else {
                System.out.println("doğru aralık girmediniz ...");
            }
        }

    }
}






