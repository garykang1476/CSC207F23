package banking.gateway;

import banking.entity.BankAccount;

import java.util.HashMap;

public class InMemoryBankAccountManager implements BankAccountGateway {

    HashMap<Integer, BankAccount> bankAccountHashMap = new HashMap<>();


    @Override
    public boolean isBankAccountExist(int id) {
        return bankAccountHashMap.containsKey(id);
    }

    @Override
    public BankAccount getBankAcountById(int id) {
        return bankAccountHashMap.get(id);
    }

    @Override
    public void updateAccount(BankAccount bankAccount) {
        int id = bankAccount.getAccNum();
        bankAccountHashMap.put(id, bankAccount);
    }
}
