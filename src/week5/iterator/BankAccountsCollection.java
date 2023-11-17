package week5.iterator;

import banking.entity.BankAccount;

import java.util.ArrayList;
import java.util.Iterator;

public class BankAccountsCollection implements Iterable<BankAccount> {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccountsCollection() {
    }

    public void addAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }


    @Override
    public Iterator<BankAccount> iterator() {
        return new BankAccountIterator();
    }

    private class BankAccountIterator implements Iterator<BankAccount>{

        private int current;

        @Override
        public boolean hasNext() {
            return current < bankAccounts.size();
        }

        @Override
        public BankAccount next() {
            return bankAccounts.get(current ++);
        }
    }
}
