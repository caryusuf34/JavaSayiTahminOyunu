import java.util.Scanner;
import  java.security.SecureRandom;
public class Main {
    public static void main(String[] args) {

        int girilenSayi = 0;
        int kalanHak ;
        boolean TahminOyunu = true;

        SecureRandom rand = new SecureRandom();
        Scanner giris = new Scanner(System.in);
        int rastgele = rand.nextInt(100);



        for (kalanHak=1; kalanHak <3; kalanHak ++){

            do {
                System.out.println("Lütfen bir sayı giriniz :");
                girilenSayi = giris.nextInt();
                if (girilenSayi > 0 && girilenSayi <=100) {
                    if (girilenSayi > rastgele) {
                        if (kalanHak >0 ){
                                System.out.print((girilenSayi - rastgele) + " kadar yaklaştınız...lütfen daha küçük sayı giriniz ");
                        }
                        else {
                            System.out.println("giriş hakkınız kalmamıştır.");
                        }
                    }
                    else if (rastgele > girilenSayi) {
                        if (kalanHak >0 ){
                            System.out.print((rastgele-girilenSayi) + " kadar yaklaştınız...lütfen daha büyük sayı giriniz ");
                        }
                        else {
                            System.out.println("giriş hakkınız kalmamıştır.");

                        }
                    }
                    else if (girilenSayi == rastgele) {
                        System.out.print("girilen sayı :" + girilenSayi + "dır...Tebrikler ....");
                        break;
                    }
                } else {
                    System.out.println("doğru aralık girmediniz ...");
                }
            }
            while (TahminOyunu !=true);


        }


    }
}
