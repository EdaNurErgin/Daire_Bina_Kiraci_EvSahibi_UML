import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Kullanicidan veri almak icin Scanner olusturuldu
        ArrayList<Konut> konutListesi = new ArrayList<>();//Konut turunde bir arraylist olusturduk
     //daire bilgisi bina bilgisi ev sahibi adi soyadi kiraci adi  soyadi gibi bilgiler bu listede tutulacak


        //Sistemimizde gerceklestirebilecek secenekleri yazdik
        while (true) {
            System.out.println("1. Daire ekle");
            System.out.println("2. Bina ekle");
            System.out.println("3. Kiracı ekle");
            System.out.println("4. Ev Sahibi ekle");
            System.out.println("5. Konutları Listele");
            System.out.println("6. Çıkış");

            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();//kullanicidan sectigi eylemi aldik
            scanner.nextLine();



            //kullanicinin yazdigi rakama gore switch icerisindeki ilgili numarali bolge calisacaktir.
            switch (secim) {
                case 1:
                    System.out.print("Daire adresi: ");
                    String daireAdres = scanner.nextLine();//daire adresi kullanicidan aldik
                    System.out.print("Daire numarası: ");
                    int daireNumara = scanner.nextInt();//daire numarasini kullanicidan aldik
                    konutListesi.add(new Daire(daireAdres, daireNumara, 0)); // daire sinifi yapicisini cagirdik ilgili atamalari yaptik ve bu bilgileri konutListesi icerisine attik.
                    break;
                case 2:
                    System.out.print("Bina adresi: ");
                    String binaAdres = scanner.nextLine(); //kullanicidan bina adresini aldik
                    System.out.print("Bina kat sayısı: ");
                    int binaKatSayisi = scanner.nextInt(); //kullanicidan binakatsayisini aldik
                    konutListesi.add(new Bina(binaAdres, binaKatSayisi));// bina sinifi yapicisini cagirdik ilgili atamalari yaptik ve bu bilgileri konutListesi icerisine attik.
                    break;
                case 3:
                    System.out.print("Kiracı adı: ");
                    String kiraciAd = scanner.nextLine(); //kullanicidan kiraci adini aldik
                    System.out.print("Kiracı soyadı: ");
                    String kiraciSoyad = scanner.nextLine(); //kullanicidan kiraci soyadini aldik
                    konutListesi.add(new Kiraci(kiraciAd, kiraciSoyad, null)); //Kiraci sinifi yapicisini cagirdik ilgili atamalari yaptik ve bu bilgileri konutListesi icerisine attik.
                    break;
                case 4:
                    System.out.print("Ev Sahibi adı: ");
                    String evSahibiAd = scanner.nextLine();//evsahibi adini kullanicidan aldik
                    System.out.print("Ev Sahibi soyadı: ");
                    String evSahibiSoyad = scanner.nextLine(); ///ev sahibi soyadini kullanicidan aldik
                    konutListesi.add(new EvSahibi(evSahibiAd, evSahibiSoyad, null)); // EvSahibi sinifi yapicisini cagirdik ilgili atamalari yaptik ve bu bilgileri konutListesi icerisine attik.
                    break;
                case 5:
                    System.out.println("Konut Listesi:");
                    for (Konut konut : konutListesi) {//konutListesi arraylist deki elemanlar  gezilir
                        konut.displayInfo();//Konut sinifi icerisindeki displayInfo methodu yardimiyla ekrana yazilir
                    }
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}