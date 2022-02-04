import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Vücut Kitle Endexi Hesaplama Programına Hoşgeldiniz");
        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen Kilonuzu Giriniz: ");
        float Kilo = input.nextFloat();
        String Sonuc1= Kilo>80 ? "AHHASDHHADFASGHD ŞİŞKO" : "Ehhh";
        System.out.println(Sonuc1);

        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        float Boy = input.nextFloat();
        float Endex = Kilo / Boy * Boy;

        System.out.println ("Vücut Kitle Endexiniz: "+ Endex);

    }
}
