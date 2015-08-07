package com.abby.console_temp;

import com.abby.entity.User;
import com.abby.model.UserModel;

import java.util.Scanner;

/**
 * Created by Stasja on 07.08.2015.
 */
public class Main {

    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        for (; ; ) {
            System.out.println("please enter your login and password");
            Scanner in = new Scanner(System.in);



            boolean userExists = userModel.isUserInDataBase(new User(in.nextLine(), in.nextLine()));

            if (userExists) {
                System.out.println("Welcome");
                break;
            } else {
                System.out.println("Such user don't exists, maybe you want to register y/n");
            }

            if (in.nextLine().equals("y")) {
                System.out.println("Please enter your login");
                String login = in.nextLine();
                System.out.println("Please enter your pass");
                String pass = in.nextLine();
                userModel.addUser(new User(login, pass));
            }
        }

    }
}
