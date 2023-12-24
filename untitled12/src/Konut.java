abstract class Konut {//soyut sinif olan Konut sinifi
    private String adres; //String turunde adres degiskeni tanimladik.Sadece bu siniftan erisilir.
    //Bu adres degiskeni bina bilgileri daire bilgileri icin tanimlandi.

    public Konut(String adres) {//Konut sinifinin yapicisini tanimladik. String turunde adres paramtresi alir
        this.adres = adres;//adres atamasi yapilmistir
    }

    public String getAdres() {//adtresin disaridan okunulabilir olmasini sagladik.
        return adres;
    }


    //konut bilgilerini yazdirmak icin void turunde bu methodu tanimladik.
    public void displayInfo() {
        System.out.println("Konut Bilgileri: " + adres);
    }
}