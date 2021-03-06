import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double km=0.1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Uçak Bileti Hesaplayan Program");
        System.out.println("------------------------------");

        System.out.print("Mesafeyi Kilometre cinsinden giriniz : ");
        int mesafe=scanner.nextInt();
        if(mesafe<=0){
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }

        System.out.print("Yaşınızı giriniz : ");
        int yas=scanner.nextInt();
        if(yas<=0){
            System.out.println("Hatalı veri girdiniz");
            System.exit(0);
        }
        System.out.print("Yolculuğunuz tek yön ise  1, gidiş dönüş ise 2 yazınız : ");
        int yolculukTipi=scanner.nextInt();

        double tutar=mesafe*km;

        if(yas<12)
            tutar/=2;
        if(yas>=12 && yas <24)
            tutar-=tutar*0.1;
        if(yas>65)
            tutar-=tutar*0.3;

        if(yolculukTipi==2) {
            tutar *= 2;
            tutar -= tutar * 0.2;
        }

        System.out.println("Toplam Tutar : "+tutar);
    }
}
