import java.math.BigDecimal;
import java.util.Scanner;

public class KalkulatorPajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer gajiBruto, biayaWajib, gajiNeto;
        double persentasePph, totalPph;
        String nama;

        System.out.print("Nama : ");
        nama = input.next();

        System.out.print("Masukkan total gaji dalam setahun : Rp. ");
        gajiBruto = input.nextInt();

        System.out.print("Masukkan total pengeluaran wajib dalam setahun : Rp. ");
        biayaWajib = input.nextInt();

        // 1. Hitung PTKP
        gajiNeto = gajiBruto - biayaWajib;

        // 2. Hitung pph
      
        if (gajiNeto <= 50000000) {
            persentasePph = 0.05;
        } else if(gajiNeto > 50000000 && gajiNeto <= 250000000) {
            persentasePph = 0.15;
        } else if(gajiNeto > 250000000 && gajiNeto <= 500000000) {
            persentasePph = 0.25;
        } else {
            persentasePph = 0.50;
        }
        totalPph =  persentasePph * ( (float) gajiNeto );

        System.out.println("=======================================================");
        System.out.println("Nama : " + nama);
        System.out.println("Total Gaji Bruto : " + gajiBruto.toString());
        System.out.println("Total Kebutuhan Wajib : " + gajiBruto.toString());
        System.out.println("Total Gaji Neto (PKP) : " + gajiNeto.toString());
        System.out.println("PPH : " + ((int) (persentasePph * 100)) + "% = " + ((int) totalPph));
    }

}