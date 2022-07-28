package main;

import service.AccountService;
import service.LoginService;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.DisplayMenu();
        
    }
}
