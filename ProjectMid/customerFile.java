package ProjectMid;

import java.util.Scanner;

public class customerFile {
    public static Scanner input = new Scanner(System.in);
    public static void menuKlien(){
        while (true){
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
            case 6:
                return;

            }
        }
    }
}
