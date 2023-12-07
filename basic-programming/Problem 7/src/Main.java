import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static float calculateMean(float[] numbers) {
        float sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
//            sum += numbers[i]; bisa juga pake ini
        }

        return (float) sum / numbers.length;
    }


    public static void main(String[] args) {
//        Scanner angka = new Scanner(System.in);
//        System.out.println("angka berapa?");
        float[] haduh = {1, 2, 3, 4};
        System.out.println(calculateMean(haduh));
    }

}