import java.util.Scanner;
import  java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        int girilenSayi;

        SecureRandom rand = new SecureRandom();
        Scanner giris = new Scanner(System.in);

        int rastgele = rand.nextInt(100);

        for (int i = 1; i < 3; i++) {
            System.out.println("lütfen bir sayı giriniz  :");
            girilenSayi = giris.nextInt();
            if (girilenSayi < 100 && girilenSayi > 0) {  // sayı 1 ve 99 dahili aralığında

                if (girilenSayi == rastgele) {
                    System.out.println("bravo kazandınız..");

                } else {
                    System.out.println( (girilenSayi - rastgele) + "kadar yaklaştınız");

                }

            } else if (girilenSayi == -1) {
                System.out.println("-1 e bastınız, kusura bakmayın devam edemeyeceğim");
                break;

            } else {
                System.out.println("lütfen doğru sayı aralığında giriniz:");
            }


        }

    }


}

