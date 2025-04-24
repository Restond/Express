package main.java.express.cargohandler;

import java.util.Scanner;

public class CargoHandler {

    int destination;

    Cargo cargo = new Cargo();
    Scanner input = new Scanner(System.in);

    /**
     *
     * 方法名：inputData
     * 该方法用于提示并存储数据
     *
     */
    public void inputData() {
        System.out.print("请输入货物编号：");
        cargo.cargoNumber = input.nextLong();

        System.out.print("\n请输入寄件人姓名：");
        cargo.senderName = input.nextLine();

        System.out.print("\n请输入寄件人电话：");
        cargo.senderPhone = input.nextLong();

        System.out.print("\n请输入收件人姓名：");
        cargo.receiverName = input.nextLine();

        System.out.print("\n请输入收件人电话：");
        cargo.receiverPhone = input.nextLong();

        System.out.print("\n请输入收件人地址：");
        cargo.receiverAddress = input.nextLine();

        System.out.print("\n请输入寄送区域（1-5）：");
        destination = input.nextInt();

        System.out.print("\n请输入货物重量（kg）：");
        cargo.weight = input.nextDouble();
    }

    /**
     *
     * 方法名：computeCharge
     * 该方法用于计算货物运费
     * @return 返回运费 Charge
     *
     */
    public double computeCharge() {
        switch (destination) {
            case 1:
                if (cargo.weight <= 1) {
                    cargo.charge = 10;
                } else {
                    cargo.charge = ((int)cargo.weight - 1) * 5 + 10;
                }
                break;
            case 2:
                if (cargo.weight <= 1) {
                    cargo.charge = 12;
                } else {
                    cargo.charge = ((int)cargo.weight - 1) * 8 + 10;
                }
                break;
            case 3:
                if (cargo.weight <= 1) {
                    cargo.charge = 15;
                } else {
                    cargo.charge = ((int)cargo.weight - 1) * 10 + 10;
                }
                break;
            case 4:
                if (cargo.weight <= 1) {
                    cargo.charge = 18;
                } else {
                    cargo.charge = ((int)cargo.weight - 1) * 12 + 10;
                }
                break;
            case 5:
                if (cargo.weight <= 1) {
                    cargo.charge = 30;
                } else {
                    cargo.charge = ((int)cargo.weight - 1) * 25 + 10;
                }
                break;
            default: System.out.println("请输入正确的区域编号！"); break;
        }

        return cargo.charge;
    }

    /**
     *
     * 方法名：showCharge
     * 该方法用于显示运费
     *
     */
    public void showCharge() {
        double charge = computeCharge();
        System.out.println(charge);
    }
}
