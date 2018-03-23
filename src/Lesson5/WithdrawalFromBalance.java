package Lesson5;

public class WithdrawalFromBalance {
    public static void main(String[] args) {
        String[] names = {"Andrey", "Oleg", "Alex", "Sem"};
        int[] balances = {500, 200, 300, 200};

        System.out.println(withdraw(names, balances, "Andrey", 50));
    }

    static int withdraw(String[] clients, int[] balance, String client, int amound) {
        int indClient = 0;
        for (String el : clients) {
            if (el == client) {
                break;
            }
            indClient++;
        }
        int withdrawalFromBal = balance[indClient] >= amound ? balance[indClient] - amound : -1;
        return withdrawalFromBal;
    }
}
