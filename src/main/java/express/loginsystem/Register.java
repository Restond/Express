package main.java.express.loginsystem;

import main.java.express.FileWrite;
import java.io.IOException;
import java.util.Scanner;

public class Register {

    public static Scanner input = new Scanner(System.in);

    public void register() throws IOException {
        FileWrite fileWrite = new FileWrite();

        String passwordFile = "UserDate.txt";

        System.out.println("----您正在注册----");
        System.out.print("用户名：");
        String userName = input.nextLine();

        while (true) {
            System.out.print("密码：");
            String userPass = input.nextLine();

            System.out.print("再次输入密码：");
            String userPassConfirm = input.nextLine();

            if (userPass.equals(userPassConfirm)) {
                fileWrite.fileAppend(passwordFile, userName + ":" + userPass + "\n");
                System.out.println("注册成功！");
                System.out.println();
                break;
            } else {
                System.out.println("密码不一样！");
            }
        }
    }
}
