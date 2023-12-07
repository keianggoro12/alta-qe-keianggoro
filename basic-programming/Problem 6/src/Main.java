import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

 //kondisinya adalah ini
    // Ganjil = Y
    // Genap = Z
    // Kelipatan 3 = X
    // parameternya nama nya = height
    //

    private static String drawXYZ(int height) {
        int total_length = height*height;
        String tampung = "";

        for(int i = 1; i <= total_length; i++){
            if (i%3 == 0) {
                tampung += "X";
            } else if (i%2 == 0){
                tampung += "Z";
            } else {
                tampung += "Y";
            }

            if (i%height == 0){
                tampung += "\n";
            }
        }

        return tampung;
    }


    public static void main(String[] args) {
        Scanner tetew = new Scanner(System.in);
        System.out.println("input berapa");
        int angka = tetew.nextInt();
        System.out.println(drawXYZ(angka));





    }


}