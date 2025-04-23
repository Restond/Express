package main.java.express;

import main.java.express.loginsystem.Login;
import main.java.express.loginsystem.Register;
import java.io.IOException;
import java.util.Scanner;

public class Express {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login();
        Register register = new Register();

        int counts = 0;

        boolean validLogin = false;

        do {
            System.out.println("---运费计算系统---");
            System.out.println("   1.登录");
            System.out.println("   2.注册");
            System.out.println("   0.退出");

            try {
                switch (input.nextInt()) {
                    case 1:
                        validLogin = login.login();
                        counts++;
                        break;
                    case 2:
                        register.register();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("A error has occurred while Login or Register");
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }

            if (counts >= 3) {
                System.out.println("登录失败超过三次，请重新运行程序！");
                System.exit(0);
            }

        } while (!validLogin);

        System.out.println("---运费计算系统---");
        System.out.println("  1.");
        System.out.println("  2.");
        System.out.println("  3.");
        System.out.println("  4.");
    }
}
