package ProjectMid;

import java.util.ArrayList;
import java.util.Scanner;

public class adminFile {
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
                    listKamar();
                    tambahKamar();
                    break;
                case 2:
                    listKamar();
                    updateKamar();
                    break;
                case 3:
                    listKamar();
                    hapusKamar();
                    break;
                case 4:
                    manajementTamu();
                    break;
                case 5:
                   laporanKeuangan();
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void laporanKeuangan() {
        int total= 0;
        int counter = 1;
        System.out.println("No.\t Tanggal\t Pemasukan ");
        for (detailCustomer tmp : customerFile.dataCostumer) {
            int harga = dataKamar.get(customerFile.cariNomorBarisPelanggan(tmp.namaCostumer)).hargaKamar;
            System.out.println(counter + "\t " + tmp.tanggalCheckin + "\t Rp." + harga);
            total += harga;
            counter++;

        }
        System.out.println("-----------------------------------");
        System.out.println("\t\t Total : Rp." + total);
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

    public static void updateKamar() {
        detailKamar tmp = new detailKamar();
        System.out.println("Masukkan nomor kamar yang ingin diupdate :");
        tmp.nomorKamar = input.nextInt();
        System.out.println("Masukkan jenis kamar yang baru :");
        tmp.jenisKamar = input.next();
        System.out.println("Masukkan harga kamar yang baru :");
        tmp.hargaKamar = input.nextInt();
        dataKamar.set(cariNomorKamar(tmp.nomorKamar),tmp);
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

    public static void manajementTamu() {
        System.out.println("------- DAFTAR TAMU -------");
        System.out.println("Nama\tNomor Kamar\tCheck-in\tCheck-out\tMetode pembayaran");
        for (detailCustomer list : customerFile.dataCostumer) {
            System.out.println(list.namaCostumer + "\t\t\t" + list.nomorKamarYangDipesan + "\t\t" + list.tanggalCheckin + "\t\t" + list.tanggalCheckout + "\t\t" + list.metodePembayaran);
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
    public static void listKamar() {
        System.out.println("------- KAMAR YANG TERSEDIA -------");
        System.out.println("Nomor Kamar\tJenis Kamar\tHarga Kamar");
        for (detailKamar list : dataKamar) {
            System.out.println(list.nomorKamar + "\t\t\t" + list.jenisKamar + "\t\t" + list.hargaKamar);
        }
    }
}
