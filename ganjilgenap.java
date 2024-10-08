import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) throws Exception {
        
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        Double bilangan = inputan.nextDouble();

        if (bilangan % 2 == 0) {
            System.out.print("Adalah bilangan genap : " + bilangan);
        }else{
            System.out.print("Adalah bilangan ganjil : " + bilangan);
        }
        inputan.close();
        
    }
}
