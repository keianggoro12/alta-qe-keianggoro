public class Tabung {
    int jari;
    int tinggi;

    public Tabung(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public int voltabung(){
        int volumenyatabung = this.tinggi * this.jari * this.jari * 22/7;
        return volumenyatabung;
    }
}
