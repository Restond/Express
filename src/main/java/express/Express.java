package main.java.express;

import main.java.express.cargohandler.CargoHandler;
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

        boolean validSystem = false;
        CargoHandler cargoHandler = new CargoHandler();

        while (!validSystem) {
            showMenu();
            switch (input.nextInt()) {
                case 1: cargoHandler.inputData(); break;
                case 2: cargoHandler.showCharge(); break;
                case 3: cargoHandler.showMessage(); break;
                case 0: validSystem = true; break;
                default: System.out.println("A error has occurred while cargoSystem"); break;
            }

        }
    }

    /**
     * 方法名：shouMenu
     * 该方法用于输出选择菜单
     *
     */
    public static void showMenu() {
        System.out.println("-----运费计算系统-----");
        System.out.println("   1.货物数据录入");
        System.out.println("   2.计算运费");
        System.out.println("   3.货物信息显示");
        System.out.println("   0.退出程序");

        System.out.print("\n请输入你的选择: ");
    }
}
