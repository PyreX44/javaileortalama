import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,kimya,fizik,tarih,ntp,rob;

        Scanner kullaniciNot = new Scanner(System.in);

        System.out.print("Matematik notunuzu Giriniz : ");
        mat = kullaniciNot.nextInt();

        System.out.print("Kimya notunuzu Giriniz : ");
        kimya = kullaniciNot.nextInt();

        System.out.print("Fizik notunuzu Giriniz : ");
        fizik = kullaniciNot.nextInt();

        System.out.print("Tarih notunuzu Giriniz : ");
        tarih = kullaniciNot.nextInt();

        System.out.print("Nesne Tabanlı Programlama notunuzu Giriniz : ");
        ntp = kullaniciNot.nextInt();

        System.out.print("Robotik Kodlama notunuzu Giriniz : ");
        rob = kullaniciNot.nextInt();

        float dersler = (mat + kimya + fizik + tarih + ntp + rob);

        double ortalama;

        ortalama = dersler / 6.0;

        System.out.print("Ortalamanız : " + ortalama);
    }
}
