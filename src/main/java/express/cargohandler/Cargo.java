package main.java.express.cargohandler;

public class Cargo {
        private long cargoNumber;
        private long senderPhone;
        private String senderName;

        private String receiverAddress;
        private String receiverName;
        private long receiverPhone;

        private double weight;
        private double charge;

        public long getCargoNumber() {
                return this.cargoNumber;
        }

        public long getSenderPhone() {
                return this.senderPhone;
        }

        public String getSenderName() {
                return this.senderName;
        }

        public String getReceiverAddress() {
                return this.receiverAddress;
        }

        public String getReceiverName() {
                return this.receiverName;
        }

        public long getReceiverPhone() {
                return this.receiverPhone;
        }

        public double getWeight() {
                return this.weight;
        }

        public double getCharge() {
                return this.charge;
        }

        public void setCargoNumber(long cargoNumber) {
                this.cargoNumber = cargoNumber;
        }

        public void setSenderPhone(long senderPhone) {
                this.senderPhone = senderPhone;
        }

        public void setSenderName(String senderName) {
                this.senderName = senderName;
        }

        public void setReceiverAddress(String receiverAddress) {
                this.receiverAddress = receiverAddress;
        }

        public void setReceiverName(String receiverName) {
                this.receiverName = receiverName;
        }

        public void setReceiverPhone(long receiverPhone) {
                this.receiverPhone = receiverPhone;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        public void setCharge(double charge) {
                this.charge = charge;
        }

        public String toString() {
                return "货物编号：" + this.getCargoNumber() + ".\n" +
                       "寄件人姓名：" + this.getSenderName() + ".\n" +
                       "寄件人电话：" + this.getSenderPhone() + ".\n" +
                       "收件人姓名：" + this.getReceiverName() + ".\n" +
                       "收件人电话：" + this.getReceiverPhone() + ".\n" +
                       "收件人地址：" + this.getReceiverAddress() + ".\n" +
                       "货物重量：" + this.getWeight() + " kg.\n";
        }
}
