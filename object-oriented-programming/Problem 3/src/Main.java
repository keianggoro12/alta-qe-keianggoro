import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );

// ini yang input 6
        int wakwaw = 6;
        System.out.println("ini loh rek faktor nya");
        for (int j = 1; j <= wakwaw; j++){
            if (wakwaw % j == 0) {
                System.out.println(j);
            }
        }


        System.out.println();

 // ini yang input 20
        int wadaw = 20;
        System.out.println("cihuyyy");
        for (int njay = 1; njay <= wadaw; njay++){
            if (wadaw % njay == 0) {
                System.out.println(njay);
            }
        }


        System.out.println();

// ini versi baru


// akhir tugas problem 3


            // ini versi gabut nya
        System.out.println("Masukkan angka");
        int angka = a.nextInt();
        System.out.println("ini loh rek faktor nya");
        for (int j = 1; j <= angka; j++) {

            if (angka % j == 0) {
                System.out.println(j  + " cihuyyyyy");
            }
        }
    }
}