import java.util.Scanner;

public class Konversinilai {
    public static void main(String[] args) {
        Double nilai;
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukan Nilai : ");
        nilai = inputan.nextDouble();

        if (nilai >= 85){
           System.out.print("A" );
        }else if (nilai >= 75){
            System.out.print("B" );
        }else if (nilai >= 65){
            System.out.print("C" );
        }else if (nilai > 55){
            System.out.print("D" );
        }else {
            System.out.print("E" );
        }

        inputan.close();
    }
    
}
