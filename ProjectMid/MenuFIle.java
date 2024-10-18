package ProjectMid;

import java.util.Scanner;

public class MenuFIle {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(true) {
            tampilkanMenu();
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    customerFile.menuKlien();
                    break;
                case 2:
                    adminFile.menuAdmin();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf Menu Tidak Tersedia");
                    break;
            }
        }


    }

    private static void tampilkanMenu() {
        System.out.println("1. Pelanggan");
        System.out.println("2. Admin");
        System.out.println("3. Keluar Aplikasi");
        System.out.print("Masukkan Pilihan Anda:");
    }
}
