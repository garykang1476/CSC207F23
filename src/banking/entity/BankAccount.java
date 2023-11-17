package banking.entity;

import java.io.Serializable;

public class BankAccount implements Serializable {


    private int accNum;
    protected int balance;

    public BankAccount(int id){
        accNum = id;
    }

    public BankAccount(int id, int amount){
        accNum = id;
        balance = amount;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccNum() {
        return accNum;
    }
}
