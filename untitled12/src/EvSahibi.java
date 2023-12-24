class EvSahibi extends Konut {//EvSahibi sinifi Konut sinifini miras alir
    private String name;// evsahibinin adini sadece bu siniftan eriselecek sekilde bilgisini tutan bir degisken tanimladij
    private String surname;// evsahibinin soyadini sadece bu siniftan eriselecek sekilde bilgisini tutan bir degisken tanimladij

    public EvSahibi(String name, String surname, Bina bina) {//EvSahibi yapicisi tanimladik.String turunde name ,surname ve Bina turunde bina parametresi alir.
        super("");//miras alindigi icin atama yaparken super kullandik
        this.name = name;
        this.surname = surname;
    }



    //konut sinifindan override edildi
    public void displayInfo() { //Ev sahibi bilgilerini yazdirmak icin bu methodu yazdik
        System.out.println("Ev Sahibi Bilgileri: " + name + ", " + surname);
    }
}