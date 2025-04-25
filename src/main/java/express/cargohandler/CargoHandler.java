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
        cargo.setCargoNumber(input.nextLong());

        input.nextLine();

        System.out.print("请输入寄件人姓名：");
        cargo.setSenderName(input.nextLine());

        System.out.print("请输入寄件人电话：");
        cargo.setSenderPhone(input.nextLong());

        input.nextLine();

        System.out.print("请输入收件人姓名：");
        cargo.setReceiverName(input.nextLine());

        System.out.print("请输入收件人电话：");
        cargo.setReceiverPhone(input.nextLong());

        input.nextLine();

        System.out.print("请输入收件人地址：");
        cargo.setReceiverAddress(input.nextLine());

        System.out.print("请输入寄送区域（1-5）：");
        destination = input.nextInt();

        System.out.print("请输入货物重量（kg）：");
        cargo.setWeight(input.nextDouble());

        System.out.println("货物数据录入完毕！");
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
                if (cargo.getWeight() <= 1) {
                    cargo.setCharge(10);
                } else {
                    cargo.setCharge(((int)cargo.getWeight() - 1) * 5 + 10);
                }
                break;
            case 2:
                if (cargo.getWeight() <= 1) {
                    cargo.setCharge(12);
                } else {
                    cargo.setCharge(((int)cargo.getWeight() - 1) * 8 + 10);
                }
                break;
            case 3:
                if (cargo.getWeight() <= 1) {
                    cargo.setCharge(15);
                } else {
                    cargo.setCharge(((int)cargo.getWeight() - 1) * 10 + 10);
                }
                break;
            case 4:
                if (cargo.getWeight() <= 1) {
                    cargo.setCharge(18);
                } else {
                    cargo.setCharge(((int)cargo.getWeight() - 1) * 12 + 10);
                }
                break;
            case 5:
                if (cargo.getWeight() <= 1) {
                    cargo.setCharge(30);
                } else {
                    cargo.setCharge(((int)cargo.getWeight() - 1) * 25 + 10);
                }
                break;
            default: System.out.println("请输入正确的区域编号！"); break;
        }

        return cargo.getCharge();
    }

    /**
     *
     *
     * 方法名：showCharge
     * 该方法用于显示运费
     *
     */
    public void showCharge() {
        double charge = computeCharge();
        System.out.println("快递运费：" + charge + " 元");
    }

    /**
     *
     * 方法名：showMessage
     * 该方法用于显示货物信息
     *
     */
    public void showMessage() {
        System.out.println(cargo.toString());
    }
}
