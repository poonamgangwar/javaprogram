public class BankAccount {
        private String accountHolderName;
        private String bankName;
        private double accountBalance;

        public BankAccount(String accountHolderName, String bankName, double initialBalance) {
            this.accountHolderName = accountHolderName;
            this.bankName = bankName;
            accountBalance = initialBalance;
        }
        public String getAccountHolderName(){
            return accountHolderName;
        }
        public String getBankName(){
            return bankName;
        }
        public double getBalance() {
            return accountBalance;
        }
        public void deposit(double money) {
            if(money>0)
                accountBalance +=money;
            else
                System.out.println("Rupees should be positive");
        }
        public void withdraw(double money){
            if(money< accountBalance)
                accountBalance -=money;
            else
                System.out.println("Withdrawl amount should be less then your current amount");
        }
    }

