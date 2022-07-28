package service;

import java.util.Scanner;

import object.IRepository;

public class RegisterService {
	private IRepository iRepository;
	private Scanner sc = null;

	public RegisterService() {
		this.sc = new Scanner(System.in);
	}

	public void DisplayRegister() {
    	System.out.printf("Username: ");
    	String username = sc.next();
    	System.out.printf("Password: ");
    	String password = sc.next();
    	System.out.printf("Re-password: ");
    	String repassword = sc.next();
    	System.out.printf("\n");
    	if (checkRegister(username, password, repassword)) {
			AdminService adminService = new AdminService();
			adminService.DisplayMenu();
		} else {
			System.out.println("Wrong input");
		}
    }
	
	
	public boolean checkRegister(String username, String password, String repassword) {
		if (username.equalsIgnoreCase("user") && password.equalsIgnoreCase("123") && repassword.equalsIgnoreCase(password)) {
			return true;
		}
		return false;
	}
}
