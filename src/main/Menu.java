package main;

import java.util.Scanner;

import object.IRepository;

class Menu {
    private IRepository iRepository;
    private Scanner sc = null;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void DisplayMenu() {
        int job = 0;
        do {
            this.printMenu();
            job = sc.nextInt();
            sc.nextLine();
            switch (job) {
                case 0:
                    doAddUser();
                    break;
                case 1:
                    doUpdateUser();
                    break;
                case 2:
                    doDeleteUser();
                    break;
                case 3:
                    doCreatePrivateGroup();
                    break;
                case 4:
                    doCreatePrivateGroup();
                    break;
                case 5:
                    doCreatePrivateGroup();
                    break;
                case 6:
                    doJoinPublicGroup();
                    break;
                case 7:
                    doSaveData();
                    break;
                case 8:
                    doSaveData();
                    break;
                case 9:
                    doLogout();
                    break;
            }
        } while (job != 9);

    }

    private void doLogout() {
    }

    private void doSaveData() {
    }

    private void doJoinPublicGroup() {
    }

    private void doCreatePrivateGroup() {
    }

    private void doDeleteUser() {
    }

    private void doUpdateUser() {
    }

    private void doAddUser() {
    }

    private void printMenu() {
        System.out.println("");
        System.out.println("0. Add new user");
        System.out.println("1. Edit information of user");
        System.out.println("2. Delete a user");
        System.out.println("3. Create a new chat group");
        System.out.println("4. Delete a chat group");
        System.out.println("5. Join your private chat group");
        System.out.println("6. Join the public chat group");
        System.out.println("7. Save the data");
        System.out.println("8. Restore the data");
        System.out.println("9. Log out and exit");
        System.out.print("What do you want? ");
    }
}