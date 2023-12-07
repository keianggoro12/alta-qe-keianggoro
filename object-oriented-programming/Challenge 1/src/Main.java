import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(4);
        System.out.println("Luas persegi = " + persegi1.luaspersegi());
        System.out.println("keliling persegi = " + persegi1.kelilingersegi());

        System.out.println("====");

        Segitiga segitiga1 = new Segitiga(3, 4);
        System.out.println("Luas segitiga = " + segitiga1.luassegitiga());
        System.out.println("keliling segitiga = " + segitiga1.kelilingsegitiga());

        System.out.println("====");

        Persegipanjang persegipanjang1 = new Persegipanjang(7, 8);
        System.out.println("Luas persegi panjang = " + persegipanjang1.luaspersegipanjang());
        System.out.println("keliling persegi panjang = " + persegipanjang1.kelilingersegipanjang());

        System.out.println("====");
        Scanner wadaw = new Scanner(System.in);
        System.out.println("Emang mau yang mana??");
    }
    }
