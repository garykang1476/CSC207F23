package banking;

import banking.controller.BankingController;
import banking.entity.BankAccount;
import banking.gateway.BankAccountGateway;
import banking.gateway.FileBankAccountManager;
import banking.presenter.BankingOutputPresenter;
import banking.usecase.BankingInteractor;
import banking.usecase.BankingOutputBoundary;

public class Demo {


    public static void main(String[] args) {
        BankAccountGateway bankAccountGateway = new FileBankAccountManager("bankacouonts.csv");
//        bankAccountGateway.updateAccount(new BankAccount(1));
//        bankAccountGateway.updateAccount(new BankAccount(2, 200));
        BankingOutputBoundary bankingOutputBoundary = new BankingOutputPresenter();
        BankingInteractor bankingInteractor = new BankingInteractor(bankingOutputBoundary, bankAccountGateway);
        BankingController bankingController = new BankingController(bankingInteractor);

        bankingController.saveMoney(1, 100);
        bankingController.saveMoney(2, -50);
    }
}
