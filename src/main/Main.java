package main;

import object.DataStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataStorage storage = DataStorage.createStorage();
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if (choice == 1) {
            storage.addUser();
        }
        System.out.println(storage.getUser("Bao"));
    }
}
