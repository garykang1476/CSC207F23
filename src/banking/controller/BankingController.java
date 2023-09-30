package banking.controller;

import banking.data.BankingInputRequestModel;
import banking.usecase.BankingInputBoundary;

public class BankingController {
    private BankingInputBoundary bankingInputBoundary;

    public BankingController(BankingInputBoundary bankingInputBoundary) {
        this.bankingInputBoundary = bankingInputBoundary;
    }

    public void saveMoney(int id, int amount){
        bankingInputBoundary.saveMoney(new BankingInputRequestModel(id, amount));
    }
}
