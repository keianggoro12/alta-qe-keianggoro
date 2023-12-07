public class Segitiga {
    double alassegitiga;
    double tinggisegitiga;


    public Segitiga(int alassegitiga, int tinggisegitiga) {
        this.alassegitiga = alassegitiga;
        this.tinggisegitiga = tinggisegitiga;

    }

    public double luassegitiga() {
        double lsegitiga = ( this.alassegitiga * this.tinggisegitiga /2 );
        return lsegitiga;
    }
    public double kelilingsegitiga() {
        double ksegitiga = 2 * this.tinggisegitiga + this.alassegitiga;
        return ksegitiga;
    }
}
