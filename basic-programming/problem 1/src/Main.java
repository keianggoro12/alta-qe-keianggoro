import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);

        //inputnya
        float alas = 20;
        float tinggi = 25;

        //kode nya
        float luassegitiga = (alas * tinggi)/2;
        System.out.println("Luas segitiga berarti " + luassegitiga + " meter");


        // akhir tugas problem 1


        //sisa gabut
        System.out.println();

        System.out.println("alas berapa bang?");
        float alasbaru = inputan.nextFloat();

        System.out.println("tinggi berapa bang?");
        float tinggibaru = inputan.nextFloat();
        float luasbaru = (alasbaru * tinggibaru)/2;


        System.out.println("berarti skrang luas nya " + luasbaru + " meter" );


    }
}