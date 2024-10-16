package ProjectMid;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminFile {
    public static ArrayList<detailKamar> dataKamar = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void menuAdmin() {
        while (true) {
        System.out.println("------- ADMIN MENU -------");
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Update Kamar");
        System.out.println("3. Hapus Kamar");
        System.out.println("4. Manajemen Tamu");
        System.out.println("5. Laporan Keuangan");
        System.out.println("6. Kembali ke Halaman Utama");
        System.out.print("Pilihlah fitur yang ingin digunakan : ");
        int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tambahKamar();
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    hapusKamar();
                    break;
                case 4:
                    System.out.println("hai");
                    break;
                case 5:
                    System.out.println("hai");
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void tambahKamar() {
        detailKamar tmp = new detailKamar();
        System.out.println("Masukkan nomor kamar yang ingin ditambahkan :");
        tmp.nomorKamar = input.nextInt();
        System.out.println("Masukkan jenis kamar :");
        tmp.jenisKamar = input.next();
        System.out.println("Masukkan harga kamar :");
        tmp.hargaKamar = input.nextInt();
        dataKamar.add(tmp);
    }

    public static void hapusKamar() {
        System.out.println("Masukkan nomor kamar yang ingin di hapus :");
        int hapusKamar = input.nextInt();
        int indexKamar = cariNomorKamar(hapusKamar);
        if (indexKamar != -1) {
            dataKamar.remove(indexKamar);
        }else {
            System.out.println("Masukkan nomor kamar yang benar!!");
        }
    }
    public static int cariNomorKamar(int nomorKamar) {
        int index = 0;
        for (detailKamar tmp : dataKamar) {
            if (tmp.nomorKamar == nomorKamar) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
