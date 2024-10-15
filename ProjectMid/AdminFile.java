package ProjectMid;

import java.util.Scanner;

public class AdminFile {
    public static void main(String[] args) {
        System.out.println("------- ADMIN MENU -------");
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Update Kamar");
        System.out.println("3. Hapus Kamar");
        System.out.println("4. Manajemen Tamu");
        System.out.println("5. Laporan Keuangan");
        Scanner pilihanFitur = new Scanner(System.in);
        System.out.print("Pilihlah fitur yang ingin digunakan : ");
        int pilihan = pilihanFitur.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("hai");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("hai");
                break;
            case 4:
                System.out.println("hai");
                break;
            case 5:
                System.out.println("hai");
                break;
        }
    }
}
