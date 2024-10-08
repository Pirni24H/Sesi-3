import java.util.Scanner;

public class Ujian {
    public static void main(String[] args) {
        Double nilaiujian;
        Scanner  inputan = new Scanner (System.in);

        nilaiujian = 75.0;
        System.out.print("Masukan Nilai : ");
        nilaiujian = inputan.nextDouble();

        if(nilaiujian > 75) {
           System.out.print("Lulus");
        }else {
            System.out.print("tidak lulus");
        }
 
        inputan.close();
        
    }
}
