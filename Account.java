public class Account {
    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double interestRate = 0.025;

        calculateBalance(years,investment, interestRate);
    }
        public static double calculateBalance(int years, double investment, double interestRate){
        double accountbalance = investment;

        for (int i = 1; i <= years; i++) {
            accountbalance = accountbalance + (accountbalance * interestRate);
            System.out.println(accountbalance + "Euros in year" + i);
        }
        return accountbalance;
}
}