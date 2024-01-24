public class Main {

    public static void main(String[] args) {

        Account bobAccount = new Account();
        bobAccount.withdrawFunds(100.0);
        bobAccount.depositFunds(250);
        bobAccount.withdrawFunds(50);

        bobAccount.withdrawFunds(200);

        bobAccount.depositFunds(100);
        bobAccount.withdrawFunds(45.55);
        bobAccount.withdrawFunds(54.56);

        bobAccount.withdrawFunds(54.45);

    }

}
