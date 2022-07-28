package main;

import java.io.Console;
import java.util.Scanner;

import object.IRepository;

public class LoginInterface {
	private IRepository iRepository;
	private Scanner sc = null;

	public LoginInterface() {
		this.sc = new Scanner(System.in);
	}

	public void DisplayLogin() {
    	System.out.printf("Username: ");
    	String username = sc.next();
    	System.out.printf("Password: ");
    	String password = sc.next();
    	System.out.printf("\n");
    	if (checkAccount(username, password)) {
			Menu menu = new Menu();
			menu.DisplayMenu();
		} else {
			System.out.println("Wrong input");
		}
    }
	
	public boolean checkAccount(String username, String password) {
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
}
