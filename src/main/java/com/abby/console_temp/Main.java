package com.abby.console_temp;

import com.abby.entity.Book;
import com.abby.entity.User;
import com.abby.model.UserModel;
import com.abby.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import java.util.Scanner;

/**
 * Created by Stasja on 07.08.2015.
 */
public class Main {

    public static void main(String[] args) throws HibernateException {
        UserModel userModel = new UserModel();

        for (; ; ) {
            System.out.println("please enter your login and password");
            Scanner in = new Scanner(System.in);

            User user = new User(in.nextLine(), in.nextLine());

            boolean userExists = userModel.isUserInDataBase(user.getLogin(), user.getPassword());

            if (userExists) {
                System.out.println("Welcome");
                System.out.println("Here are your books");
                user = userModel.getUser(user);
                for (Book book : user.getBooks()) {
                    System.out.println(book);
                }
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
