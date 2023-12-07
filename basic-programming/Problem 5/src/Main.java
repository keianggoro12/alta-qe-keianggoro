import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static boolean palindrome(String teks) {
        boolean result = true;

        // apa itu string builder??

//        StringBuilder reverse = new StringBuilder(teks);
//        char[] arrayReverse = reverse.reverse(). toString().toCharArray();
//        char[] word1 = teks.toCharArray();
//        return result;
//


        // teks = "katak";
        // teks.length() = 5
        // i = 5

        // Variable poli punya tipe data String dengan value awal (Kosong)
        // Creating array of string length
        // char[] arrTeks = new char[teks.length()];
        // Copy character by character into array
        // for (int i = 0; i < teks.length(); i++) {
        //   arrTeks[i] = teks.charAt(i);
        // }
        // ["k", "a", "t", "a", "k"]
        // i = 4
        // poli = k
        // poli = ka
        // poli = kat
        // poli = kata
        // poli = katak

        String poli = "";

        for(int i = (teks.length() - 1); i >= 0; i--){
            poli = poli + teks.charAt(i);
            poli += teks.charAt(i);
        }

        if(teks == poli){
            System.out.println("==== "+ teks + " adalah Palindrome =====");
        }else{
            System.out.println("==== "+ teks + " bukan Palindrome =====");
        }

        return true;
    }


    public static void main(String[] args) {
        // Ini adalah Check Kata Palindrome atau Bukan
        Scanner words = new Scanner(System.in); // Anggep aja ini type datanya string
        System.out.println("katanya apa ");
        String kata = words.nextLine();
//        String kata = "kacau";
        // words = "kasur rusak";
      boolean bukanpalindrome = palindrome(kata);

//        if(palindrome_bukan == true){
//            System.out.println(kata + " bukan palindrome");
//        } else {
//            System.out.println(kata + " bukan");
//        }



//        System.out.println(palindrome("civic")); //true
//        System.out.println(palindrome("katak")); //true
//        System.out.println(palindrome("kasur rusak")); //true
//        System.out.println(palindrome("kupu-kupu")); //true
//        System.out.println(palindrome("lion")); //true
    }
}