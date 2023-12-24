class Daire extends Konut implements Comparable<Daire> {//Daire sinifi Konut sinifini miras alır .
    //Daire sinifi, java da hazır olarak bulunan Comparable adli interface sinifini implemente eder


    //Comparable<Daire> interface'i, Daire sınıfının bu arayüzü uyguladıgını soyler.
    // Bu interface, nesnelerin karşılaştırılabilir olmasını sağlar.
    // Yani, compareTo metodu aracılığıyla bir nesnenin başka bir nesne ile nasıl karşılaştırılacağını belirlememize olanak tanir
    //compareTo metodu, genellikle sıralama işlemlerinde kullanılır. Özellikle Collections.sort() gibi sıralama metodları, bu metodu kullanarak nesneleri sıralar.
    // Comparable arayüzü, nesnelerin kendi içinde doğal bir sıralama yöntemi oluşturmasına olanak tanır.
    //Kodumuzda ise bu özel interface şu işe yaramıştır:
    // Daire sınıfı Comparable<Daire> arayüzünü uyguladi. compareTo metodu, daire numaralarını karşılaştırarak sıralama işlemi için kullanılıyor.
    // Örneğin, Collections.sort() kullanildiğinda,
    // Daire nesneleri bu metodun tanımladığı karşılaştırma mantığına göre sıralanabilir.
    //Daha ayrıntılı bir sekilde projemizin algoritmasine uygun ornek verecek olursak sunu soyleyebilriz:
    //konutListesi adlı listedeki Daire nesnelerini sıralamak istediğimizde,
    // Java bu compareTo metodunu kullanarak sıralama işlemini gerçekleştiririz. Bu metot,
    // Daire nesnelerini daire numaralarına göre küçükten büyüğe doğru veya tam tersine sıralamak için kullanılabilir.

    private int apartmentNo;//daire numarasi bilgisini sadece bu sinif icinde erisilecek sekilde tutması amaciyla apartmentNo degiskeni tanimlandi.



    //Daire sinifinin yapici methodunu; adres , apartmentNo, KatSayisi olacak sekilde 3 parametreli tanimladik.
    public Daire(String adres, int apartmentNo, int KatSayisi) {
        super(adres);//bu degiskeni konut sinifindan miras aldigimiz icin atama yaparken super ifadesini kullandik.
        this.apartmentNo = apartmentNo;//daire numarasi atanmistir
    }


    //method konut sinifindan miras alinarak override edilmistir.
    public void displayInfo() {//bu method daire bilgilelrini ve daire numarasini yazdirmak icin void turunda tanimlanmis bir fonksiyondur
        System.out.println("Daire Bilgileri: " + getAdres() + ", No: " + apartmentNo);
    }

    //bu methodu comperable interface sayesinde override ettik
    // Bu metot, Daire nesnelerini karşılaştırmak için kullanılır.
    public int compareTo(Daire otherDaire) {//geri donduren turden bir fonksiyon olup Daire turunde bir parametre alir.
        return Integer.compare(this.apartmentNo, otherDaire.apartmentNo);
        //Integer.compare(this.apartmentNo, otherDaire.apartmentNo) ifadesi apartmentNo adlı değişkeni iceren Daire nesnelerini karşılaştirir
    }
    //Bu yöntemin mantigini su sekilde aciklayabiliriz:
    //Eger this.apartmentNo (bu dairenin daire numarası) otherDaire.apartmentNo'dan (karşılaştırılan diğer daire nesnesinin daire numarası) küçükse, negatif bir değer döner.
    //Eger this.apartmentNo esitse otherDaire.apartmentNo'ya, sifirr döner.
    //Eger this.apartmentNo buyukse otherDaire.apartmentNo'dan, pozitif bir deger doner.
    //Bu yontem, genellikle siralama islemlerinde kullanilir

    //neden bu methodu dogrudan cagırmadik?
    //compareTo metodunun dogrudan çağrilmasi yerine, siralama işlemleri gibi özel durumlarda
    // Java, bu metodu arka planda cagirir ve nesneleri karsilastirarak dogru siralamayi yapar.
    // Bu sayede bizim ozel olarak her seferinde compareTo metodunu çagirmak gibi bir islem yapmaniza gerek kalmaz.
    // Java, bu metodun varligi sayesinde siralama islemlerini dogru sekilde yapabilirrr.
}