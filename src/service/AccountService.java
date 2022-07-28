package service;

import java.util.Scanner;

import object.IRepository;

public class AccountService {
	private IRepository iRepository;
    private Scanner sc = null;

    public AccountService() {
        sc = new Scanner(System.in);
    }
    
    public void DisplayMenu() {
    	
            int job = 0;
            do {
                this.printMenu();
                job = sc.nextInt();
                sc.nextLine();
                switch (job) {
                    case 1:
                        doLogin();
                        break;
                    case 2:
                        doRegister();
                        break;
                    default:
                    	System.out.println("Thank you for");
                    
                }
            } while (job != 2);

        
    }

}
