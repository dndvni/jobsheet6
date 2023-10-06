import java.util.Scanner;

public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.println("Masukkan sudut pertama segitiga");
        int sudut1 = input02.nextInt();

        System.out.println("Masukkan sudut kedua segitiga");
        int sudut2 = input02.nextInt();

        System.out.println("masukkan sudut ketiga segitiga");
        int sudut3 = input02.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan segitiga");
            }
}