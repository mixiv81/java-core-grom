package lesson30.task1;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Bank usBank = new USBank(1111, "Sweden", Currency.USD, 100, 1400, 4, 444344343);
        Bank euBank = new EUBank(2222, "Italy", Currency.EUR, 150, 1500, 5, 87656254);
        Bank chinaBank = new ChinaBank(3333, "Sweden", Currency.USD, 200, 1600, 4, 444344343);

        User user1 = new User(101, "Denis", 12200, 40, "GMD", 1500, usBank);
        User user2 = new User(102, "Ann", 10000, 50, "GMD", 1500, usBank);

        User user3 = new User(103, "Denis", 12200, 40, "GMD", 1500, euBank);
        User user4 = new User(104, "Ann", 10000, 30, "GMD", 1500, euBank);

        User user5 = new User(105, "Denis", 12200, 40, "GMD", 1500, chinaBank);
        User user6 = new User(106, "Ann", 10000, 10, "GMD", 1500, chinaBank);

        UkrainianBankSystem bankSystem = new UkrainianBankSystem();


        bankSystem.withdraw(user1, 200);
        Thread.sleep(2000);
        bankSystem.withdraw(user2, 300);
//        bankSystem.withdraw(user3, 2);
//        bankSystem.withdraw(user4, 1500);
//        bankSystem.withdraw(user5, 40);
//        bankSystem.withdraw(user6, 200);
//        System.out.println("1  " + user1.getBalance());
//        System.out.println("2  " + user2.getBalance());
//        System.out.println("3  " + user3.getBalance());
//        System.out.println("4  " + user4.getBalance());
//        System.out.println("5  " + user5.getBalance());
//        System.out.println("6  " + user6.getBalance());
        Thread.sleep(2000);


//        bankSystem.withdraw(user1, 20000);
//        bankSystem.withdraw(user2, 200000);
//        bankSystem.withdraw(user3, 2);
//        bankSystem.withdraw(user4, 150000);
//        bankSystem.withdraw(user5, 40);
//        bankSystem.withdraw(user6, 200);
        bankSystem.fund(user1, 26000);
        Thread.sleep(2000);

        bankSystem.fund(user2, 200);
//        bankSystem.fund(user3, 20000);
//        bankSystem.fund(user4, 100022);
//        bankSystem.fund(user5, 400000);
//        bankSystem.fund(user6, 100000);
        Thread.sleep(2000);

//        System.out.println("1  " + user1.getBalance());
//        System.out.println("2  " + user2.getBalance());
//        System.out.println("3  " + user3.getBalance());
//        System.out.println("4  " + user4.getBalance());
//        System.out.println("5  " + user5.getBalance());
//        System.out.println("6  " + user6.getBalance());
        bankSystem.transferMoney(user1, user2, 10);
//        bankSystem.transferMoney(user3,user4,200);
//        bankSystem.transferMoney(user5, user6, 1200000);

//        System.out.println(user1.getBalance());
//        System.out.println(user2.getBalance());
//        System.out.println(user3.getBalance());
//        System.out.println(user4.getBalance());
//        System.out.println(user5.getBalance());
//        System.out.println(user6.getBalance());
        Thread.sleep(2000);
        bankSystem.paySalary(user1);
//        bankSystem.paySalary(user2);
//        bankSystem.paySalary(user3);
//        bankSystem.paySalary(user4);
//        bankSystem.paySalary(user5);
//        bankSystem.paySalary(user6);
//
//        System.out.println(user1.toString());
//        System.out.println(user2.toString());
//        System.out.println(user3.toString());
//        System.out.println(user4.toString());
//        System.out.println(user5.toString());
//        System.out.println(user6.toString());

        System.out.println(bankSystem.getTransactions());
    }
}