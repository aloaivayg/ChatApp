package main;

import object.DataStorage;
import service.AccountService;
import service.LoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.DisplayMenu();
        
    }
}
