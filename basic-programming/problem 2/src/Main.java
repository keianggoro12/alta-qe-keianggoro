import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);


        //input
        int studentScore = 80;

        //Process
        String value = " ";
        if (studentScore >= 80 && studentScore <= 100){
            value = "A";
        } else if (studentScore >= 65 && studentScore <= 79){
            value = "B+";
        } else if (studentScore >= 50 && studentScore <= 64){
            value = "B";
        } else if (studentScore >= 35 && studentScore <= 49){
            value = "C";
        } else if (studentScore >= 0 && studentScore <= 34) {
            value = "D";
        } else {
            value = "invalid";
        }

        //Output Nilai A
        System.out.println("Nilai Siswa Tersebut adalah " + value);

// akhir tugas problem 2


        // ini versi gabut
        System.out.println("input nilai siswa");
        int nilai = inputan.nextInt();

        String status = " ";
        if (nilai >= 80 && nilai <= 100){
            status = "Pinter rek orangnya";
        } else if (nilai >= 65 && nilai <= 79){
            status = "lumayan lahh,,";
        } else if (nilai >= 50 && nilai <= 64){
            status = "udah mulai gak bener nihh";
        } else if (nilai >= 35 && nilai <= 49){
            status = "kebanyakan main epep jamsot alok cihuyy";
        } else if (nilai >= 0 && nilai <= 34) {
            status = "udah gak bisa ditolong,, dah kenak mental nih";
        } else {status = "tunggu updatetan selanjutnya sampe bisa-_-";

        }

        System.out.println(status  + " gitu katanya, bukan saya yang bilang");
    }
}

