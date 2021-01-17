public class TestAccount {

    public static void main(String[] args) {

        CustomerB customerB = new CustomerB(333, "Arisha", 'f');
        Account account = new Account(777, customerB, 10000);
        System.out.println(account);
        System.out.println(account.deposit(500));
        System.out.println(account.withdraw(6000));
    }
}
