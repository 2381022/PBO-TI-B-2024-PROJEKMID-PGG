package ProjectMid;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class customerFile {
    public static ArrayList<detailCustomer>dataCostumer = new ArrayList<>();
    public static String nama;
    public static Scanner input = new Scanner(System.in);
    private static String jenisKamarPengguna;
    public static void menuKlien() {
        while (true) {
            System.out.println("------- MENU CUSTOMER -------");
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
                    cariKamar();
                    break;
                case 2:
                    daftarKamarTersedia();
                    break;
                case 3:
                    pemesananKamar();
                    break;
                case 4:
                    pembatalanPemesanan();
                    break;
                case 5:
                    pembayaran();
                    break;
                case 6:
                    return;

            }
        }
    }
    public static void cariKamar(){
        System.out.print("Masukkan tipe kamar yang diinginkan : ");
        input.nextLine();
        jenisKamarPengguna = input.nextLine();
    }
    public static void daftarKamarTersedia(){
        System.out.println("NomorKamar\tJenisKamar\tHargaKamar");
        for (int i = 0; i < adminFile.dataKamar.size(); i++){
            if(Objects.equals(jenisKamarPengguna, adminFile.dataKamar.get(i).jenisKamar)){
                System.out.println("\t"+adminFile.dataKamar.get(i).nomorKamar+"\t\t"+
                        adminFile.dataKamar.get(i).jenisKamar+"\t\t"+adminFile.dataKamar.get(i).hargaKamar);
            }
        }
    }
    public static void pemesananKamar(){
        detailCustomer data = new detailCustomer();
        System.out.println("Masukkan nama : ");
        input.nextLine();
        nama = input.nextLine();
        System.out.println("Masukkan format tanggal checkin/out dalam format seperti berikut: dd/mm/yyyy");
        System.out.println("Masukkan tanggal checkin : ");
        data.tanggalCheckin = input.nextLine();
        System.out.println("Masukkan tanggal checkout : ");
        data.tanggalCheckout = input.nextLine();
        daftarKamarTersedia();
        System.out.println("Masukkan nomor kamar yang ingin dipesan : ");
        data.nomorKamarYangDipesan = input.nextInt();
        System.out.println("Apakah anda yakin atas pesanan anda?(y/n) : ");
        String konfirmasiPesanan = input.nextLine();
        if (konfirmasiPesanan.equals("y")){
            data.namaCostumer = nama;
            dataCostumer.add(data);
        }
    }

    public static int cariNomorBarisPelanggan (String target) {
        for (int i = 0; i < dataCostumer.size(); i++ ){
            if (dataCostumer.get(i).namaCostumer.equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void pembatalanPemesanan() {
        if (nama != null){
            System.out.println("Anda yakin ingin membatalkan ? (y/n) : ");
            String konfirmasi = input.next();
            if (konfirmasi.equals("y")) {
                int nomorBaris = cariNomorBarisPelanggan(nama);
                if (nomorBaris != -1) {
                    dataCostumer.remove(nomorBaris);
                }
            }
        }
    }

    public static void pembayaran() {
        int nomorBaris = cariNomorBarisPelanggan(nama);
        System.out.println("Masukkan Metode Pembayaran (1=cash/0=transfer : ");
        int pilihan = input.nextInt();
        if (pilihan == 1){
            dataCostumer.get(nomorBaris).metodePembayaran = true;

        }else if (pilihan == 0){
            dataCostumer.get(nomorBaris).metodePembayaran = false;
        }else {
            System.out.println("Pilihan yang anda salah");
        }
    }
}
