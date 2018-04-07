package lesson5;

public class WithdrawalFromBalances {

    public int withdraw(String[] clients, int[] balances, String client, int amount) {
        int clIndex = 0;
        for (String el : clients) {
            if (el == client) {
                break;
            }
            clIndex++;
        }
        if (clients[clIndex] != null) {
            int withDrawlFromBalance = balances[clIndex] >= amount ? balances[clIndex] - amount : -1;
            return withDrawlFromBalance;
        }
        return 0;
    }
}
