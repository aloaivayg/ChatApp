package service;

import java.io.Console;
import java.util.Scanner;

import object.IRepository;

public class LoginService {
	private IRepository iRepository;
	private Scanner sc = null;

	public LoginService() {
		this.sc = new Scanner(System.in);
	}

	public void DisplayLogin() {
    	System.out.printf("Username: ");
    	String username = sc.next();
    	System.out.printf("Password: ");
    	String password = sc.next();
    	System.out.printf("\n");
    	if (checkLogin(username, password)) {
			AdminService adminService = new AdminService();
			adminService.DisplayMenu();
		} else {
			System.out.println("Wrong input");
		}
    }
	
	
	public boolean checkLogin(String username, String password) {
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
}
