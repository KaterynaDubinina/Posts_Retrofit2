package org.example.app.view;

import java.util.Scanner;

public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String chooseOption() {
        getMenu();
        return scanner.nextLine();
    }

    private static void getMenu() {
        System.out.println(""" 
                
                1 - Get all users.
                2 - Get user by id.
                0 - Close the application.
                """);
    }

    public void getOutput(String output, String choice) {
        if (choice.equals("0")) System.out.println(output);
        scanner.close();
        System.exit(0);
    }

}
