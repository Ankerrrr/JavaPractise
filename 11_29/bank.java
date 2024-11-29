class Account {
    private int money = 0;
    private int bankCompanyCode;
    private double feeN = 1.015; // adjust Transfer Fee

    Account() {
        bankCompanyCode = 0;
    }

    Account(int code) {
        bankCompanyCode = code;
    }

    void withdraw(int n) {
        if (n <= money) {
            this.money -= n;
        } else {
            System.out.println("balance not enough");
        }
    };

    void deposit(int n) {
        this.money += n;
    };

    void transfer(Account otherAccount, int n) {
        if (money >= n) {
            if (bankCompanyCode == otherAccount.bankCompanyCode) {
                this.money -= n;
                otherAccount.money += n;
                System.out.println("Same bank Trandfer succ, NoFee");
            } else {
                double feee = Math.floor((n * feeN));
                if (this.money <= feee) {
                    System.out.println("balance not enough, cant Transfer");
                    return;
                }
                this.money -= feee;
                otherAccount.money += n;
                System.out.println(
                        "different bank Trandfer succ bank(" + this.bankCompanyCode + " to "
                                + otherAccount.bankCompanyCode +
                                ")\n" + "PlusFee(1.5%):" + feee);
            }
        } else {
            System.out.println("balance not enough, cant Transfer");
        }
    };

    void printBalance() {
        System.out.println("$: " + money);
    }
}

public class bank {
    public static void main(String[] args) {
        // same bank Code
        Account John = new Account(200);
        Account Mary = new Account(200);
        // different Code
        Account Anke = new Account(300);

        John.deposit(500);
        John.printBalance();
        Mary.deposit(600);
        Mary.printBalance();
        John.transfer(Mary, 499);
        John.printBalance();
        Mary.printBalance();
        John.withdraw(500);

        Mary.transfer(Anke, 500);
        Mary.printBalance();
        Anke.printBalance();
    }
}