import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Fungsi Prima harus mengembalikan hasil berupa : Boolean
    // Dimana Boolean memiliki nilai berupa (True/False)
    // Fungsi Prima juga memiliki sebuah paramter dengan type data integer

    public static boolean Prima(int raw) {
        // Kondisi
        if(raw<=1) {
            return false;
        }

        // Perulangan dengan kondisi
        for(int j=2; j<=raw/2; j++) {
            if((raw % j) == 0)
                return false;
        }

        // Hasil
        return true;
    }

    public static void main(String[] args) {
        // Ini Adalah Check Bilangan Prima
        Scanner wadaw = new Scanner(System.in);
        // println ini adalah function
        // namaFunction(...parameter)
        System.out.println("Angkanya berapa ");
        int angka = wadaw.nextInt();
        boolean hasil = Prima(angka);
        // hasil = false

        // Prima(angka) = hasilnya bakalan true/false
        // Prima(angka) = false

        if(hasil == true){
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " Bukan bilangan prima");
        }


    }



}

//    public static Boolean primeNumber(int angka) {
//        // your code here
//
//    }
//    public static void main(String []args){
////        System.out.println(primeNumber(11)); // true
////        System.out.println(primeNumber(13)); // true
////        System.out.println(primeNumber(17)); // true
////        System.out.println(primeNumber(20)); // false
////        System.out.println(primeNumber(35)); // false
//    }



