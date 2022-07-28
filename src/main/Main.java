package main;

import object.DataStorage;
import service.LoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        loginService.DisplayLogin();
        
    }
}
