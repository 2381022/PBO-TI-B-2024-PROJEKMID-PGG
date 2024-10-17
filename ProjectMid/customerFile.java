package ProjectMid;

import java.util.Objects;
import java.util.Scanner;

public class customerFile {
    public static Scanner input = new Scanner(System.in);
    private static String jenisKamarPengguna;
    public static void menuKlien() {
        while (true) {
            System.out.println("------- MENU CLIENT -------");
            System.out.println("1. Cari Kamar");
            System.out.println("2. Daftar Kamar Tersedia");
            System.out.println("3. Pemesanan Kamar");
            System.out.println("4. Pembatalan Reservasi");
            System.out.println("5. Pembayaran");
            System.out.println("6. Kembali Ke Menu Utama");
            System.out.print("Pilihlah fitur yang ingin digunakan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("hi");
                    break;
                case 2:
                    System.out.println("hi");
                    break;
                case 3:
                    System.out.println("hi");
                    break;
                case 4:
                    System.out.println("hi");
                    break;
                case 5:
                    System.out.println("hi");
                    break;
                case 6:
                    return;

            }
        }
    }
    public static void cariKamar(){
        System.out.println("Masukkan tipe kamar yang diinginkan : ");
        jenisKamarPengguna = input.nextLine();
    }
    public static void daftarKamarTersedia(){
        System.out.println("NomorKamar\tJenisKamar\tHargaKamar");
        for (int i = 0; i < AdminFile.dataKamar.size(); i++){
            if(Objects.equals(jenisKamarPengguna, AdminFile.dataKamar.get(i).jenisKamar)){
                System.out.println("\t"+AdminFile.dataKamar.get(i).nomorKamar+"\t\t"+
                        AdminFile.dataKamar.get(i).jenisKamar+"\t\t"+AdminFile.dataKamar.get(i).hargaKamar);
            }
        }
    }




}
