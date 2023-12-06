package com.example.DataBasePracticeSCDTheory;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
@Log
public class Controller implements CommandLineRunner {

    @Autowired
    ArrayList<Users> users = new ArrayList<>();

    @RequestMapping("/Enter")
    public void EnterUserData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            log.info("Enter User Name: ");
            String name = scanner.nextLine();
            log.info("Enter User ID: ");
            int userId = scanner.nextInt();
            log.info("Enter User Age: ");
            int age = scanner.nextInt();
            users.add(new Users(userId, name, age));
        }
    }

    @RequestMapping("/Show")
    public void GetUserData() {
        for (Users user : users) {
            log.info("User ID: " + user.getUserId());
            log.info("User Name: " + user.getName());
            log.info("User Age: " + user.getAge());
        }
    }

    @Override
    public void run(String... args) throws Exception {
        // This method will be executed when the application starts
    }
}
