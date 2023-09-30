package banking.presenter;

import banking.usecase.BankingOutputBoundary;

public class BankingOutputPresenter implements BankingOutputBoundary {

    @Override
    public void displayBlanaceAfterDepoisit(int balance) {
        System.out.println("The new balance is" + balance);

    }
}
