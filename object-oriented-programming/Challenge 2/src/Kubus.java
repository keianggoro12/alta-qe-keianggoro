import java.util.Scanner;

public class Kubus {
    

    int sisikubus;

    public Kubus(int sisikubus) {
        this.sisikubus = sisikubus;

    }


    public int luaskubus() {
        int lkubus = this.sisikubus * this.sisikubus * this.sisikubus;
        return lkubus;
    }


}
