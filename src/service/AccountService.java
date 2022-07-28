package service;

import java.util.Scanner;

import object.IRepository;

public class AccountService {
	private IRepository iRepository;
	private AdminService adminService;
	private LoginService loginService;
	private RegisterService registerService;
    private Scanner sc = null;

    public AccountService() {
        sc = new Scanner(System.in);
        adminService = new AdminService();
        loginService = new LoginService();
        registerService = new RegisterService();
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
    private void doRegister() {
		loginService.DisplayLogin();	
	}

	private void doLogin() {
		registerService.DisplayRegister();
	}

	private void printMenu() {
		System.out.println("");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.print("What do you want? ");
	}

}
