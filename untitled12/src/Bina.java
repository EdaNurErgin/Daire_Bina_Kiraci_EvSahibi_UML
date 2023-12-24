class Bina extends Konut { //Bina sinifi , Konut sinifini miras alir
    private int KatSayisi; //binadaki dairenin kacinci katta oturdugunun bilgisini sadece Bina sinifindan erisilmek üzere bilgisini tutmasi amaciyla KatSayisi degiskeni tanimladik

    public Bina(String adres, int KatSayisi) {//Bina sinifinin yapici methodunu tanimladik ve bu yapici methot adres ve KatSayisi parametrelerini alır
        //adres parametresini miras aldigimiz konut sinifindan getirttik.Bu yüzden super ifadesini kullanmaliyiz .
        super(adres);
        this.KatSayisi = KatSayisi;
    }


    //bu method Konut sinifindan miras alinmistir fakat override edilmistir yani degistirilmistir body'si
    public void displayInfo() {//bu method bina bilgilerini ve kat sayisini yazdirmak icin geri dondurmeyen bir fonksiyon olarak tanimlandi
        System.out.println("Bina Bilgileri: " + getAdres() + ", Kat Sayısı: " + KatSayisi);
    }
}