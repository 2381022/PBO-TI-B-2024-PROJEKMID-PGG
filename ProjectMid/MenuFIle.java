package ProjectMid;

import java.util.Scanner;

public class MenuFIle {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        tampilkanMenu();


    }

    private static void tampilkanMenu() {
        System.out.println("1. Pelanggan");
        System.out.println("2. Admin");
        System.out.print("Masukkan Pilihan Anda:");
    }

}
