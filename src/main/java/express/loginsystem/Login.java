package main.java.express.loginsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static Scanner input = new Scanner(System.in);

    public boolean login() throws IOException {
        String passwordFile = "UserDate.txt";

        System.out.println("----您正在登录----");
        System.out.print("用户名：");
        String loginName = input.next();

        System.out.print("密码：");
        String loginPass = input.next();

        boolean isValid = validDateUser(passwordFile, loginName, loginPass);

        if (isValid) {
            System.out.println("登录成功！");
            return true;
        } else {
            System.out.println("用户名或密码错误！");
            return false;
        }
    }

    /**
     * 验证用户名和密码
     * @param fileName 文件目录
     * @param userName 用户名
     * @param password 密码
     * @return 验证结果
     */
    private static boolean validDateUser(String fileName, String userName, String password) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(userName) && parts[1].equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
