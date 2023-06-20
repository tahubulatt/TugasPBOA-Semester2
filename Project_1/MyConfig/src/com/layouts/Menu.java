package com.layouts;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("------------------------");
            System.out.println(" WELCOME TO ...");
            System.out.println("------------------------");
            System.out.println("1.] Read Data");
            System.out.println("2.] Insert data");
            System.out.println("3.] Edit Data");
            System.out.println("4.] Delete data");
            System.out.println("5.] Exit");
            System.out.println("------------------------");
            System.out.println("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    ReadData.readData();
                    break;
                case 2:
                    InsertData.insertData();
                    break;
                case 3:
                    EditData.editData();
                    break;
                case 4:
                    DeleteData.deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    } 
}
