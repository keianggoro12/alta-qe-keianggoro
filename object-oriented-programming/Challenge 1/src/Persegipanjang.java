public class Persegipanjang {
    int ppersegipanjang;
    int lpersegipanjang;


    public Persegipanjang(int ppersegipanjang, int lpersegipanjang) {
        this.ppersegipanjang = ppersegipanjang;
        this.lpersegipanjang = lpersegipanjang;


    }

    public int luaspersegipanjang() {
        int lpersegip = this.ppersegipanjang * this.lpersegipanjang;
        return lpersegip;
    }
    public int kelilingersegipanjang() {
        int kpersegip = 2 * (this.ppersegipanjang + this.lpersegipanjang);
        return kpersegip;
    }
}
