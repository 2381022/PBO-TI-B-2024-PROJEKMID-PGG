package ProjectMid;

import java.util.Objects;
import java.util.Scanner;

public class menuFile {
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
                    loginSebagaiAdmin();
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
    private static void loginSebagaiAdmin(){
        System.out.print("Masukkan Username : " );
        input.nextLine();
        String username = input.nextLine();
        System.out.print("Masukkan Password : " );
        int password = input.nextInt();
        if (Objects.equals(username, "Admin") && password == 123 ) {
            adminFile.menuAdmin();

        }else {
            System.out.println("Password atau Username yang anda masukan salah");
        }
    }

    private static void tampilkanMenu() {
        System.out.println("------- RESERVASI HOTEL -------");
        System.out.println("1. Customer");
        System.out.println("2. Admin");
        System.out.println("3. Keluar Aplikasi");
        System.out.print("Masukkan Pilihan Anda : ");
    }
}
