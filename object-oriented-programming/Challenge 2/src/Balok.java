public class Balok {
    int pbalok;
    int lbalok;
    int tbalok;

    public Balok(int pbalok, int lbalok, int tbalok) {
        this.pbalok = pbalok;
        this.lbalok = lbalok;
        this.tbalok = tbalok;
    }

    public int volbalok(){
        int volumenyaabalok = this.pbalok * this.lbalok * this.tbalok;
        return volumenyaabalok;
    }
}
