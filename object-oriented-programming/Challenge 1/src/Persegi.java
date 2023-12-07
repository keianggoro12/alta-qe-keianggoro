public class Persegi {

    int sisipersegi;


    public Persegi(int sisipersegi) {
        this.sisipersegi = sisipersegi;

    }

    public int luaspersegi() {
        int lpersegi = this.sisipersegi * this.sisipersegi;
        return lpersegi;
    }
    public int kelilingersegi() {
        int kpersegi = 4 * this.sisipersegi;
        return kpersegi;
    }
}