class Kiraci extends Konut {//Kiraci sinifi Konut sinifini extend eder
    private String name; //String turunde kiraci adi tanimladik.Sadece bu sinifta erisilir
    private String surname;//String turunde kiracı soyadi tanimladik.Sadece bu sinifta erisilir

    public Kiraci(String name, String surname, EvSahibi evSahibi) {//Kiraci yapici tanimladik. String turunde name ,surname ve EvSahibi turunde evsahibi parametrelerini alir
        super("");//miras aldigimiz icin atama yaparken super ifadesini kullandik
        this.name = name;//isme atama yaptik
        this.surname = surname;//soyada atama yaptik.
    }



    //bu method konut sinifindam miras alinip override edilmistir
    public void displayInfo() {//kiraci bilgilerini yazdirmak icin bu methodu tanimladik
        System.out.println("Kiracı Bilgileri: " + name + ", " + surname);
    }
}