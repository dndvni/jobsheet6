import java.util.Scanner;

public class Pemilihan2Perocobaan102 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        System.out.println("Tahun Kabisat");
        int tahun = input02.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else 
            System.out.println("Bukan Tahun Kabisat");
    }
}