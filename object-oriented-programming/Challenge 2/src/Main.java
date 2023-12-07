import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(10);
        System.out.println("volume persegi = " + kubus1.luaskubus());

        System.out.println("====");

        Balok balok1 = new Balok(3, 6, 10);
        System.out.println("Volume balok adalah = " + balok1.volbalok());

        System.out.println("====");

        Tabung tabung1 = new Tabung(7, 10);
        System.out.println("Volume Tabung adalah = " + tabung1.voltabung());

        System.out.println("====");

        Scanner wadaw = new Scanner(System.in);
//        Kubus wadaw1 = new Kubus();
        System.out.println("masukkan angka sisi kubus");
        }
    }
